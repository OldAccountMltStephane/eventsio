<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Session extends Model
{

    protected $fillable = ['evenement_id', 'name', 'start_at', 'end_at'];



    /**
     * Un utilisateur peut participer à plus d'un événement.
     *
     * @return void
     */
    public function event()
    {
        return $this->belongsTo('App\Evenement');
    }



    /**
     * Une session peut avoir plus d'un participant
     *
     * @return void
     */
    public function participations()
    {
        return $this->hasMany('App\Participation');
    }
}
