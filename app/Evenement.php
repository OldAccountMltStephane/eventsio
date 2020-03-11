<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Evenement extends Model
{
    /**
     * Mass assignement
     */
    protected $fillable = ['user_id', 'name', 'description', 'location'];
 
    /**
     * Relation Evenement belongsTo User
     */
    public function user() {
        return $this->belongsTo('App\User');
    }

    /**
     * Relation Evenement hasMany Sessions
     */
    public function sessions() {
        return $this->hasMany('App\Session');
    }
}
