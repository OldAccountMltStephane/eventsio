@extends('layouts.app')



@section('content')
<!--  -->
<div class="container bg-white border rounded-0 p-4">

    <h1 class="mb-0">Espace administration</h1>
    <small>Click on headers to toggle</small>
    <hr>

    <h2 onClick="$(this).next().slideToggle()"><span class="font-weight-light">[{{ $users->count() }}]</span>
        UTILISATEURS</h2>
    <div class="list-group">
        @foreach($users as $user)
        <div class="list-group-item list-group-item-action">
            <button class="btn btn-event btn-sm mr-3">
                <i class="fas fa-trash mr-3"></i> Supprimer
            </button>
            {{ $user->email }}
        </div>

        @endforeach
    </div>
    <hr>

    <h2 onClick="$(this).next().slideToggle()"><span class="font-weight-light">[{{ $events->count() }}]</span>
        EVENEMENTS</h2>
    <div class="list-group" style="display: none">
        @foreach($events as $event)
        <div class="list-group-item list-group-item-action">
            <button onClick="$('#deleteEvent_{{ $event->id}}').submit();" class="btn btn-event btn-sm mr-3">
                <i class="fas fa-trash mr-3"></i> Supprimer
            </button>
            <form id="deleteEvent_{{ $event->id}}" action="{{ route('events.deleteEvent', $event->id) }}" method="POST"
                style="display: none;">
                @csrf
                {{ method_field('DELETE') }}
            </form>
            <a href="{{ route('events.showEventEdition', $event->id) }}" class="btn btn-event btn-sm mr-3">
                <i class="fas fa-pen mr-3"></i> Editer
            </a>
            {{ $event->name }}
        </div>
        @endforeach
    </div>
    <hr>

    <h2 onClick="$(this).next().slideToggle()"><span class="font-weight-light">[{{ $users->count() }}]</span> SESSIONS
    </h2>
    <div class="list-group" style="display: none">
        @foreach($events as $event)
        @foreach($event->sessions as $session)
        <div class="list-group-item list-group-item-action">
            <button onClick="$('#deleteEvent_{{ $session->id}}').submit();" class="btn btn-event btn-sm mr-3">
                <i class="fas fa-trash mr-3"></i> Supprimer
            </button>
            <form id="deleteEvent_{{ $session->id}}"
                action="{{ route('events.deleteSession', [$event->id, $session->id]) }}" method="POST"
                style="display: none;">
                @csrf
                {{ method_field('DELETE') }}
            </form>
            <a href="{{ route('events.showSessionEdition', [$event->id, $session->id]) }}"
                class="btn btn-event btn-sm mr-3">
                <i class="fas fa-pen mr-3"></i> Editer
            </a>
            [{{ $event->name }}] - {{ $session->name }}
        </div>
        @endforeach
        @endforeach
    </div>

</div>

@endsection



@section('js')
@endsection



@section('css')
@endsection
