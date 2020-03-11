<?php

namespace App\Http\Controllers;

use App\Session;
use App\Evenement;
use App\Participation;
use Illuminate\Http\Request;
use App\User;

use Illuminate\Contracts\Auth\Authenticatable;

class HomeController extends Controller
{

    public function __construct()
    {
        $this->middleware('auth');
    }


    public function showHome()
    {
        $evenements = Evenement::all();
        $sessions = Session::all();
        $participations = Participation::all();
        return view('home.home', compact('evenements', 'sessions', 'participations'));
    }


    public function showMe()
    {
        return view('home.me');
    }


    public function showQr(Participation $Participation)
    {

        $session = $Participation->session;
        $evenement = Evenement::where('id', $Participation->session->evenement_id);
        return view('home.qr', compact('Participation', 'session', 'evenement'));
    }
}
