<?php

namespace App\Console\Commands;

use Illuminate\Console\Command;
use File;

class MakeViewCommand extends Command
{

    protected $signature = 'make:view {view}';
    protected $description = 'Create a new blade template.';


    public function handle()
    {
        $path = $this->viewPath($this->argument('view'));

        $content = "
@extends('layouts.app')



@section('content')
@endsection



@section('js')
@endsection



@section('css')
@endsection";

        $this->createDir($path);

        if (File::exists($path)) {
            $this->error("File {$path} already exists!");
            return;
        }

        File::put($path, $content);

        $this->info("File {$path} created.");
    }


    public function viewPath($view)
    {
        return 'resources/views/' . str_replace('.', '/', $view) . '.blade.php';
    }


    public function createDir($path)
    {
        $dir = dirname($path);
        if (!file_exists($dir)) mkdir($dir, 0777, true);
    }
}
