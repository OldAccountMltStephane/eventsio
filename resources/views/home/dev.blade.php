@extends('layouts.app')



@section('content')

<div class="container bg-white rounded-0 border p-3">
    <h1>Liste d'utilisateur BetaTesteur disponible</h1>
    <small>(Cliquez sur un utilisateur pour entre en possession de cet utilisateur)</small>
    <hr>
    <div class="row">
        @foreach($users as $user)
        <div class="col-sm-4 p-3">
            <form action="{{ route('dev.logUser', $user->id) }}" method="post">
                @csrf
                <button class="btn btn-light border btn-block">
                    <b>{{ $user->name }}</b><br>
                    Possede {{ $user->events->count() }} événement(s)<br>
                    Participe à {{ $user->participations->count() }} session(s)
                </button>
            </form>
        </div>
        @endforeach
    </div>

    @endsection



    @section('js')
    <script>
        var logUser = (user) => {
            $.get(`/dev/${JSON.parse(user).id}`)
                .done(data => {
                    console.log(data)
                })
        }

    </script>
    @endsection



    @section('css')
    @endsection
