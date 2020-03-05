<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Participation extends Model
{

    protected $fillable = ['user_id', 'session_id', 'flashed_at'];



    /**
     * Un utilisateur peut participer à plus d'un événement.
     *
     * @return void
     */
    public function session()
    {
        return $this->belongsTo('App\Session');
    }




    /**
     * Un utilisateur peut participer à plus d'un événement.
     *
     * @return void
     */
    public function user()
    {
        return $this->belongsTo('App\User');
    }
}
