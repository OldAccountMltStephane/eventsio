@extends('layouts.app')



@section('content')

<div class="container bg-event rounded-0 border mb-4">
    <div class="btn-group">
        <a href="{{ route('events.showEventCreation') }}" class="btn btn-sm btn-event rounded-0">Créer un nouvel
            événement</a>
        <a href="#" onclick="$('#logout-form').submit()" class="btn btn-sm btn-event rounded-0">Se déconnecter</a>
        <form id="logout-form" action="{{ route('logout') }}" method="POST">@csrf</form>
    </div>
</div>

<div class="container bg-white rounded-0 border p-3">
    <h1>{{ Auth::user()->name }}</h1>
    <h5 class="font-weight-light">{{ Auth::user()->email }}</h5>
    <hr>

    @if(count(Auth::user()->participations()->get()) > 0)
    <h3>Mes participations</h3>
    <div class="list-group mb-3">
        @foreach(Auth::user()->participations()->get() as $Participation)
        @if($Participation->session)
        <a href="{{ route('home.showQr', $Participation->id) }}"
            class="list-group-item list-group-item-action @if($Participation->flashed_at) flashed @else notflashed @endif">{{ $Participation->session->name }}</a>
        @endif
        @endforeach
    </div>
    @endif


    @if(count(Auth::user()->events()->get()) > 0)
    <h3>Mes événements</h3>
    <div class="list-group mb-3">
        @foreach(Auth::user()->events()->get() as $Event)
        <a href="{{ route('events.showOneEvent', $Event->id) }}"
            class="list-group-item list-group-item-action">{{ $Event->name }}</a>
        @endforeach
    </div>
    @endif

</div>

@endsection



@section('js')
@endsection



@section('css')

<style>
    .flashed {
        color: #a7a7a7 !important;
        text-decoration: line-through !important;
    }

    .flashed:hover {
        text-decoration: line-through !important;
    }

    .notflashed {
        color: #343a40 !important;
    }

</style>

@endsection
