<?php

namespace App\Http\Controllers;

use App\User;
use App\Session;
use App\Evenement;
use App\Participation;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;
use Illuminate\Support\Facades\Hash;

class ApiController extends Controller
{
    function getEvents()
    {
        return json_encode(Evenement::all());
    }

    function getEvent(Evenement $Evenement)
    {
        return json_encode($Evenement);
    }

    function getSessions()
    {
        return json_encode(Session::all());
    }

    function getSession(Session $Session)
    {
        return json_encode($Session);
    }

    function getEventSessions(Evenement $Evenement)
    {
        return json_encode($Evenement->sessions->all());
    }

    function getEventSession(Evenement $Evenement, Session $Session)
    {
        return json_encode($Session);
    }

    function getParticipations(Evenement $Evenement, Session $Session)
    {
        return json_encode($Session->participations->all());
    }

    function getParticipationUser(Evenement $Evenement, Session $Session, Participation $Participation)
    {
        return json_encode($Participation->user);
    }

    public function authUser($email, $password)
    {
        if ($u = User::where('email', $email)->first()) {
            if (Hash::check($password, $u->password)) {
                Auth::login($u);
                return json_encode($u);
            } else {
                return json_encode("Erreur de connexion");
            }
        } else {
            return json_encode("Erreur de connexion");
        }
    }


    public function getUserData($userID)
    {
        $user = User::find(1);
        return json_encode($user->participations->all());
    }

    function scanQrCode($data)
    {
        $sessionID = explode("<FNC1>", $data)[0];
        $userID = explode("<FNC1>", $data)[1];

        $participation = Participation::where([['session_id', $sessionID], ['user_id', $userID]])->first();
        if ($participation) {
            $participation->flashed_at = time();
            $participation->save();
            return json_encode('Participation validée');
        } else {
            return json_encode('Participation invalide');
        }
    }
}
