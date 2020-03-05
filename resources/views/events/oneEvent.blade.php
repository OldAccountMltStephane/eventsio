@extends('layouts.app')



@section('content')


@if($Evenement->user->id == Auth::id())
<div class="container bg-event border rounded-0 mb-4 text-center text-sm-left">
  <div class="btn-group">
    <a href="{{ route('events.showEventEdition', $Evenement->id) }}" class="btn btn-event rounded-0">Editer l'événement</a>
    <a href="#" onClick="$('#deleteEvent').submit()" class="btn btn-event rounded-0">Supprimer l'événement</a>

    <form id="deleteEvent" action="{{ route('events.deleteEvent', $Evenement->id) }}" method="POST" style="display: none;">
      @csrf
      {{ method_field('DELETE') }}
    </form>

  </div>
</div>
@endif


<div id="Evenement" class="container bg-white border rounded-0 p-0 mb-4 text-center text-sm-left">
  <h1 class="border-bottom m-0 p-3">{{ $Evenement->name }}</h1>
  <div id="description" class="border-bottom m-0 p-3">
    {!! html_entity_decode($Evenement->description) !!}
  </div>
  <div class="small m-0 p-3">
    <a href="https://www.google.com/maps/search/{{ $Evenement->location }}/">{{ $Evenement->location }}</a><br>
    <small>Par {{ $Evenement->user->name }}</small>
  </div>
</div>


@if($Evenement->user->id == Auth::id())
@include('events.sessionCreation')
@endif

@if(count($Evenement->sessions) != 0)
<div id="Sessions" class="container bg-white border rounded-0 p-3 text-center text-sm-left">
  <h5>Sessions</h5>
  @foreach($Evenement->sessions as $Session)
  <div session-id="{{ $Session->id }}" class="row mb-4 mb-sm-0">
    <div class="col-lg-2 px-3 py-2">
      <button onclick="$('#joinSession_{{ $Session->id }}').submit()" class="btn btn-sm btn-event rounded-0 w-100 @guest disabled @endguest" @guest disabled @endguest>Participer</button>
    </div>
    <div evenement-id="{{ $Evenement->id }}" session-id="{{ $Session->id }}" class="col-lg-4 px-3 py-2 my-auto align-middle sessionItem">{{ $Session->name }}</div>
    <div evenement-id="{{ $Evenement->id }}" session-id="{{ $Session->id }}" class="col-lg-3 px-3 py-2 my-auto align-middle sessionItem">Le {{ date('d/m/Y', strtotime($Session->start_at)) }} à {{ date('H:i', strtotime($Session->start_at)) }}</div>
    <div evenement-id="{{ $Evenement->id }}" session-id="{{ $Session->id }}" class="col-lg-3 px-3 py-2 my-auto align-middle sessionItem">Le {{ date('d/m/Y', strtotime($Session->end_at)) }} à {{ date('H:i', strtotime($Session->end_at)) }}</div>
  </div>

  <form id="joinSession_{{ $Session->id }}" action="{{ route('events.joinSession', [$Evenement->id, $Session->id])}}" method="POST" style="display: none;">
    @csrf
  </form>
  @endforeach

</div>
@endif

@endsection


@section('js')

<script>
  window.onload = function() {
    $('.sessionItem').on('click', function() {
      window.location.href = '/events/' + $(this).attr('evenement-id') + '/sessions/' + $(this).attr('session-id')
    })
  }
</script>

@endsection



@section('css')
<style>
  #Sessions>div:hover {
    background: #efefef;
    cursor: pointer
  }

  #description p:last-of-type{
    margin-bottom: 0;
  }
</style>
@endsection