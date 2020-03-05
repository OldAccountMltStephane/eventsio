<?php

use App\User;
use Illuminate\Foundation\Inspiring;


Artisan::command('inspire', function () {
    $this->comment(Inspiring::quote());
})->describe('Display an inspiring quote');


Artisan::command('admin {email}', function () {
    $user = User::where('email', $this->argument('email'))->first();
    $this->comment($user);
    $admin_state = $user->is_admin == "0" ? "1" : "0";
    $user->is_admin = $admin_state;
    $user->save();
    $this->comment($user);
})->describe('Godify someone');
