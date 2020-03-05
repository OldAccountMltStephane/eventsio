<?php

use Illuminate\Http\Request;

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});

Route::get('/events', 'ApiController@getEvents');
Route::get('/event/{Evenement}', 'ApiController@getEvent');
Route::get('/session/{Session}', 'ApiController@getSession');
Route::get('/sessions', 'ApiController@getSessions');

Route::get('/event/{Evenement}/sessions', 'ApiController@getEventSessions');
Route::get('/event/{Evenement}/session/{Session}', 'ApiController@getEventSession');
Route::get('/event/{Evenement}/session/{Session}/participations', 'ApiController@getParticipations');
Route::get('/event/{Evenement}/session/{Session}/participation/{Participation}', 'ApiController@getParticipationUser');

Route::get('user/{userID}/participations', 'ApiController@getUserData');

Route::get('/qr/{QR_Data}', 'ApiController@scanQrCode');
Route::get('/auth/{email}/{password}', 'ApiController@authUser');
