@extends('layouts.app')



@section('content')

@auth
<div class="container bg-event rounded-0 border mb-4">
    <div class="btn-group">
        <a href="{{ route('events.showEventCreation') }}" class="btn btn-sm btn-event rounded-0">Créer un nouvel
            événement</a>
    </div>
</div>
@endauth

<div id="evtList" class="container bg-white rounded-0 border p-0">
    @foreach($allEvents as $e)
    <a href="{{ route('events.showOneEvent',$e->id ) }}" evenement-id="{{ $e->id }}" class="evtItem">
        <h4 class="mb-0">{{ $e->name }}</h4>
        {!! html_entity_decode($e->description) !!}
    </a>
    @endforeach
</div>

@endsection



@section('js')
@endsection



@section('css')
<style>
    .evtItem {
        padding: 16px;
        border-bottom: 1px solid #efefef;
        color: white !important;
    }

    .evtItem:last-child {
        border-bottom: none;
    }

    .evtItem:hover {
        background: #efefef;
        cursor: pointer
    }

</style>
@endsection
