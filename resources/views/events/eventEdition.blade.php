@extends('layouts.app')



@section('content')
<div class="container bg-white rounded-0 border p-3">
  @if ($errors->any())
  <div class="alert alert-danger">
    <b>Erreur !</b><br>
    @foreach ($errors->all() as $error) {{ $error }}<br> @endforeach
  </div>
  @endif

  <form action="{{ route('events.editEvent', $Evenement->id) }}" method="post" class="form">

    {{ method_field('PATCH') }}
    @csrf

    <div class="row">
      <div class="form-group col">
        <label for="name">Nom de l'événement</label>
        <input value="{{ $Evenement->name }}" type="text" name="name" id="name" class="form-control rounded-0" placeholder="Nom de l'événement">
      </div>
      <div class="form-group col">
        <label for="location">Lieu de l'événement</label>
        <input value="{{ $Evenement->location }}" type="text" name="location" id="location" class="form-control rounded-0" placeholder="Lieu de l'événement">
      </div>
    </div>

    <div class="form-group">
      <label for="description">Description</label>
      <textarea name="description" id="description" class="form-control rounded-0">{{ $Evenement->description }}</textarea>
    </div>


    <button type="submit" class="btn btn-primary rounded-0 w-100">Submit</button>

  </form>
</div>
@endsection



@section('js')
<script src="https://cdn.tiny.cloud/1/i5xva9gc57npk7aifislekaadz1dgiv25459bkn7repeutpl/tinymce/5/tinymce.min.js"></script>
<script>
  tinymce.init({
    selector: '#description',
    menubar: false,
    statusbar: false,
    height: 280
  })
</script>

<script>
  componentForm = {
    street_number: 'short_name',
    route: 'long_name',
    locality: 'long_name',
    administrative_area_level_1: 'short_name',
    country: 'long_name',
    postal_code: 'short_name'
  }

  function initAutocomplete() {
    autocomplete = new google.maps.places.Autocomplete(
      document.getElementById('location'), {
        types: ['geocode']
      })
    autocomplete.setFields(['address_component'])
  }

  function geolocate() {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(function(position) {
        var geolocation = {
          lat: position.coords.latitude,
          lng: position.coords.longitude
        }
        var circle = new google.maps.Circle({
          center: geolocation,
          radius: position.coords.accuracy
        })
        autocomplete.setBounds(circle.getBounds())
      })
    }
  }
</script>
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyClWLfiiIPGCdPYH904YkM9nlDFb90DUbM&libraries=places&callback=initAutocomplete" async defer></script>
@endsection



@section('css')
@endsection