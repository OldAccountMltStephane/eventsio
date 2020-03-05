@extends('layouts.app')



@section('content')

<div class="container bg-event rounded-0 border mb-4">
    <div class="btn-group">
        @auth
        <a href="{{ route('events.showEventCreation') }}" class="btn btn-sm btn-event rounded-0">Créer un nouvel
            événement</a>
        @else
        <a href="{{ route('dev.showDev') }}" class="btn btn-sm btn-event rounded-0">Utiliser un compte test</a>
        @endauth
    </div>
</div>

<div class="container bg-white rounded-0 border p-3">
    <div class="row text-center">
        <div class="col-sm my-3"><span class="font-weight-bold text-uppercase">Evenements à venir</span>
            <hr class="my-1">{{ $evenements->count() }}</div>
        <div class="col-sm my-3"><span class="font-weight-bold text-uppercase">Sessions créées</span>
            <hr class="my-1">{{ $sessions->count() }}</div>
        <div class="col-sm my-3"><span class="font-weight-bold text-uppercase">Participations à une session</span>
            <hr class="my-1">{{ $participations->count() }}</div>
    </div>
</div>

@endsection



@section('js')
@endsection



@section('css')
@endsection
