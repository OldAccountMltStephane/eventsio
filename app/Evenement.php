<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Evenement extends Model
{

    protected $fillable = ['user_id', 'name', 'description', 'location'];



    /**
     * Un utilisateur peut participer à plus d'un événement.
     *
     * @return void
     */
    public function user()
    {
        return $this->belongsTo('App\User');
    }



    /**
     * Un utilisateur peut participer à plus d'un événement.
     *
     * @return void
     */
    public function sessions()
    {
        return $this->hasMany('App\Session');
    }
}
