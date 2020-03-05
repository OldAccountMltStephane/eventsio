@extends('layouts.app')



@section('content')

<div class="container bg-event rounded border mb-4">
  <div class="btn-group">
    <a href="#" onclick="$('#unsubscribe').submit()" class="btn btn-sm btn-event">Se désinscrire</a>
    <form id="unsubscribe" action="{{ route('events.removeParticipation', $Participation->id) }}" method="post">
      @csrf
      {{ method_field('DELETE') }}
    </form>
  </div>
</div>

<div class="container bg-white rounded border p-3">
  @if($Participation->flashed_at)
  <div class="alert alert-info small">
    Ce QR Code a été scanné le {{ date('d/m/Y', $Participation->flashed_at) }} à {{ date('H:i', $Participation->flashed_at) }}
  </div>
  @endif
  <div class="row">
    <div class="col-lg-4 mb-4 text-center text-lg-left">
      <h2>Code barre</h2>
      <svg class="img-fluid w-100" id="barcode"></svg>
    </div>
    <div class="col-lg-8 mb-4 text-center text-lg-left">
      <h2>{{ $Participation->session->name }}</h2>


      <a href="{{ route('events.showOneEvent', $Participation->session->evenement_id) }}">Acceder à la fiche de l'evenement</a>
      <div class="row mt-3">
        <div class="col"><b>Commence le</b>
          <hr class="my-1">{{ date('d/m/Y', strtotime($session->start_at)) }} à {{ date('H:i', strtotime($session->start_at)) }}</div>
        <div class="col"><b>Termine le</b>
          <hr class="my-1">{{ date('d/m/Y', strtotime($session->start_at)) }} à {{ date('H:i', strtotime($session->start_at)) }}</div>
      </div>

    </div>
  </div>
</div>

@endsection



@section('js')
<script src="https://cdn.jsdelivr.net/jsbarcode/3.6.0/barcodes/JsBarcode.code128.min.js"></script>
<!-- <script src="{{ asset('js/barcode_128.js') }}"></script> -->
<script>
  $(() => {
    JsBarcode("#barcode", "{{$Participation->session->id}}<FNC1>{{$Participation->user->id}}", {
      width: 4,
      height: 150,
      displayValue: false,
      lineColor: "#329999",
      margin: 0,
    });
  })
</script>
@endsection



@section('css')
@endsection