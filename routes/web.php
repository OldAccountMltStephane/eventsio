<?php

Auth::routes();

Route::redirect('/home', '/me');

Route::get('/dev', 'DevController@showDev')->name('dev.showDev');
Route::post('/dev/{user}', 'DevController@authUserID')->name('dev.logUser');

Route::get('/admin', 'AdminController@showHome')->name('admin.showHome');

Route::get('/', 'HomeController@showHome')->name('home.showHome');

Route::get('/me', 'HomeController@showMe')->name('home.showMe');
Route::get('/me/qr/{Participation}', 'HomeController@showQr')->name('home.showQr');

Route::get('/events', 'EventController@showAllEvents')->name('events.showAllEvents');
Route::get('/events/new', 'EventController@showEventCreation')->name('events.showEventCreation');
Route::get('/events/{Evenement}', 'EventController@showOneEvent')->name('events.showOneEvent');
Route::get('/events/{Evenement}/edit', 'EventController@showEventEdition')->name('events.showEventEdition');
Route::get('/events/{Evenement}/sessions', 'EventController@showAllSessions')->name('events.showAllSessions');
Route::get('/events/{Evenement}/sessions/new', 'EventController@showSessionCreation')->name('events.showSessionCreation');
Route::get('/events/{Evenement}/sessions/{Session}', 'EventController@showOneSession')->name('events.showOneSession');
Route::get('/events/{Evenement}/sessions/{Session}/edit', 'EventController@showSessionEdition')->name('events.showSessionEdition');

Route::post('/events', 'EventController@newEvent')->name('events.newEvent');
Route::post('/events/{Evenement}/sessions', 'EventController@newSession')->name('events.newSession');
Route::post('/events/{Evenement}/sessions/{Session}/join', 'EventController@joinSession')->name('events.joinSession');

Route::patch('/events/{Evenement}', 'EventController@editEvent')->name('events.editEvent');
Route::patch('/events/{Evenement}/sessions/{Session}', 'EventController@editSession')->name('events.editSession');

Route::delete('/events/{Evenement}', 'EventController@deleteEvent')->name('events.deleteEvent');
Route::delete('/events/{Evenement}/sessions/{Session}', 'EventController@deleteSession')->name('events.deleteSession');
Route::delete('/me/qr/{Participation}', 'EventController@removeParticipation')->name('events.removeParticipation');
