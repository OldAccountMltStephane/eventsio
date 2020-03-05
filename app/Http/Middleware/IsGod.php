<?php

namespace App\Http\Middleware;

use Closure;
use Illuminate\Support\Facades\Auth;

class IsGod
{
    /**
     * Handle an incoming request.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \Closure  $next
     * @return mixed
     */
    public function handle($request, Closure $next)
    {
        $response = $next($request);

        $event = $request->route()->parameter('Evenement');
        $auth = Auth::user();


        if ($auth && $auth->id == $event->user_id || $auth && $auth->is_admin == "1") {
            return $response;
        } else {
            return redirect()->route('error');
        }
    }
}
