<?php

namespace App\Http\Controllers;

use App\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class DevController extends Controller
{
    public function authUserID(User $user)
    {
        Auth::login($user);
        return redirect()->route('home.showHome');
    }

    public function showDev()
    {
        $users = User::inRandomOrder()->get();
        return view('home.dev', compact('users'));
    }
}
