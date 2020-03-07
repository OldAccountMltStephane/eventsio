<?php

namespace App\Http\Controllers;

use App\Evenement;
use App\Participation;
use App\Session;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class EventController extends Controller
{


    public function __construct()
    {

        $this->middleware('isgod')->only(['showEventEdition', 'showSessionEdition', 'newSession', 'editEvent', 'editSession', 'deleteEvent', 'deleteSession']);
    }


    public function showAllEvents()
    {
        $allEvents = Evenement::all();
        return view('events.allEvents', compact('allEvents'));
    }

    public function showEventCreation()
    {
        return view('events.eventCreation');
    }

    public function showOneEvent(Evenement $Evenement)
    {
        return view('events.oneEvent', compact('Evenement'));
    }

    public function showEventEdition(Evenement $Evenement)
    {
        return view('events.eventEdition', compact('Evenement'));
    }

    public function showAllSessions()
    {
        return view('events.allSessions');
    }

    public function showSessionCreation(Evenement $Evenement)
    {
        return view('events.sessionCreation', compact('Evenement'));
    }

    public function showOneSession(Evenement $Evenement, Session $Session)
    {
        return view('events.oneSession', compact('Evenement', 'Session'));
    }

    public function showSessionEdition(Evenement $Evenement, Session $Session)
    {
        return view('events.sessionEdition', compact('Evenement', 'Session'));
    }

    public function newEvent(Request $request)
    {

        // L'utilisateur doit etre connecté
        if ($loggedUser = Auth::user()) {

            // Validation du formulaire
            $validForm = $request->validate([
                'name' => ['required'],
                'description' => ['required'],
                'location' => ['required'],
            ]);

            // Création de l'événement
            $loggedUser->events()->create($validForm);
        }

        return redirect()->route('events.showAllEvents');
    }

    public function newSession(Request $request, Evenement $Evenement)
    {
        // Validation du formulaire
        $validForm = $request->validate([
            'name' => ['required'],
            'start_at' => ['required'],
            'end_at' => ['required'],
        ]);

        // Création de l'événement
        $session = $Evenement->sessions()->create($validForm);
        // dd($session);
        $this->joinSession($Evenement, $session);

        return redirect()->route('events.showOneEvent', $Evenement->id);
    }

    public function editEvent(Request $request, Evenement $Evenement)
    {
        // Validation du formulaire
        $validForm = $request->validate([
            'name' => ['required'],
            'description' => ['required'],
            'location' => ['required'],
        ]);

        // Création de l'événement
        $Evenement->update($validForm);
        return redirect()->route('events.showOneEvent', $Evenement->id);
    }

    public function editSession(Request $request, Evenement $Evenement, Session $Session)
    {
        if ($Evenement->id == $Session->evenement_id) {

            // Validation du formulaire
            $validForm = $request->validate([
                'name' => ['required'],
                'start_at' => ['required'],
                'end_at' => ['required'],
            ]);

            // Création de l'événement
            $Session->update($validForm);
        }

        return redirect()->route('events.showOneEvent', $Evenement->id);
    }

    public function deleteEvent(Evenement $Evenement)
    {
        $Evenement->sessions()->participations()->delete();
        $Evenement->sessions()->delete();
        $Evenement->delete();
        return redirect()->route('events.showAllEvents');
    }

    public function deleteSession(Evenement $Evenement, Session $Session)
    {
        $Session->delete();
        $Session->participations()->delete();
        return redirect()->route('events.showOneEvent', $Evenement->id);
    }

    public function removeParticipation(Participation $Participation)
    {
        $Participation->delete();
        return redirect()->route('home.showMe');
    }

    public function joinSession(Evenement $Evenement, Session $Session)
    {
        if (count(Participation::where([['user_id', Auth::id()], ['session_id', $Session->id]])->get()) == 0) {
            $joinSession = new Participation();
            $joinSession->user_id = Auth::id();
            $joinSession->session_id = $Session->id;
            $joinSession->flashed_at = 0;
            $joinSession->save();
        }
        return redirect()->route('home.showMe');
    }
}
