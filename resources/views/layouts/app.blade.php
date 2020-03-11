<!doctype html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- CSRF Token -->
        <meta name="csrf-token" content="{{ csrf_token() }}">

        <title>{{ config('app.name', 'Laravel') }}</title>

        <!-- Scripts -->
        <script src="{{ asset('js/app.js') }}"></script>
        @yield('js')

        <!-- Fonts -->
        <link rel="dns-prefetch" href="//fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css?family=Nunito" rel="stylesheet">

        <!-- Styles -->
        <link href="{{ asset('css/app.css') }}" rel="stylesheet">
        <link href="{{ asset('css/reboot.css') }}" rel="stylesheet">
        @yield('css')
    </head>

    <body>
        <div id="app">
            <nav class="navbar navbar-expand-md navbar-dark bg-event shadow-sm">
                <div class="container p-0">
                    <a class="navbar-brand p-0" href="{{ url('/') }}">
                        {{ config('app.name', 'Laravel') }}
                    </a>
                    <button class="navbar-toggler" type="button" data-toggle="collapse"
                        data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                        aria-expanded="false" aria-label="{{ __('Toggle navigation') }}">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarSupportedContent">

                        <ul class="navbar-nav mr-auto">
                            <li class="nav-item">
                                <a class="nav-link" href="{{ route('events.showAllEvents') }}">Les événements</a>
                            </li>

                        </ul>
                        <ul class="navbar-nav ml-auto">

                            @auth
                            @if(Auth::user()->is_admin)
                            <li class="nav-item">
                                <a class="nav-link" href="{{ route('admin.showHome') }}">Administration<i
                                        class="fas fa-lock ml-3"></i></a>
                            </li>
                            @endif
                            <li class="nav-item">
                                <a class="nav-link" href="{{ route('home.showMe') }}">{{ Auth::user()->name }}<i
                                        class="fas fa-user ml-3"></i></a>
                            </li>
                            @else
                            <li class="nav-item">
                                <a class="nav-link" href="{{ route('login') }}"> Se connecter <i
                                        class="fas fa-sign-in-alt ml-3"></i></a>
                            </li>
                            @endauth
                            </li>
                        </ul>

                    </div>
                </div>
            </nav>

            <main class="py-4">
                @yield('content')
            </main>
        </div>
    </body>

    <script>
        window.onload = () => {
            $('input').attr('autocomplete', 'off')
        }

    </script>

</html>
