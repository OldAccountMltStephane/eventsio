@extends('layouts.app')



@section('content')
<div class="container bg-white rounded border p-3">
  @if ($errors->any())
  <div class="alert alert-danger">
    <b>Erreur !</b><br>
    @foreach ($errors->all() as $error) {{ $error }}<br> @endforeach
  </div>
  @endif

  <form action="{{ route('events.editSession', [$Evenement->id, $Session->id]) }}" method="post" class="form">

    {{ method_field('PATCH') }}
    @csrf

    <div class="row">
      <div class="col-6">
        <input value="{{ $Session->name }}" type="text" name="name" id="name" class="form-control" placeholder="Lieu de l'événement" aria-describedby="helpId">
      </div>
      <div class="col-2">
        <input value="{{ $Session->start_at }}" type="text" name="start_at" id="start_at" class="form-control" placeholder="Lieu de l'événement" aria-describedby="helpId">
      </div>
      <div class="col-2">
        <input value="{{ $Session->end_at }}" type="text" name="end_at" id="end_at" class="form-control" placeholder="Lieu de l'événement" aria-describedby="helpId">
      </div>
      <div class="col-2">
        <button type="submit" class="btn btn-primary">Submit</button>
      </div>
    </div>


  </form>
</div>
@endsection



@section('js')
@endsection



@section('css')
@endsection