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

<div class="container bg-white rounded-0 border p-3 mb-4">
    <div class="row text-center">
        <div class="col-sm my-3"><span class="font-weight-bold text-uppercase">Evenements à venir</span>
            <hr class="my-1">{{ $evenements->count() }}</div>
        <div class="col-sm my-3"><span class="font-weight-bold text-uppercase">Sessions créées</span>
            <hr class="my-1">{{ $sessions->count() }}</div>
        <div class="col-sm my-3"><span class="font-weight-bold text-uppercase">Participations à une session</span>
            <hr class="my-1">{{ $participations->count() }}</div>
    </div>
</div>

<div class="container bg-white rounded-0 border p-3">
    <h1>
        <a href="https://github.com/MltStephane/eventsio/blob/master/Pointage/Pointage/Exe/Pointage.apk">
            Télécharger l'application mobile
        </a>
    </h1>
    <p>L'application mobile vous permet de scanner les codes barres de vos invités ou d'acceder plus rapidement aux
        codes barres des événements auxquels vous participez</p>
</div>

@endsection



@section('js')
@endsection



@section('css')
@endsection
