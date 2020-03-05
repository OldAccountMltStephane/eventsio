<?php

use App\User;
use App\Session;
use App\Evenement;
use App\Participation;
use Illuminate\Database\Seeder;

class DatabaseSeeder extends Seeder
{
    /**
     * Seed the application's database.
     *
     * @return void
     */
    public function run()
    {
        // $this->call(SetupSeeder::class);
        $faker = Faker\Factory::create('fr_FR');

        $u = new User;
        $u->name = "email@email.net";
        $u->email = "email@email.net";
        $u->password = Hash::make('123456789');
        $u->save();

        for ($i = 0; $i < 125; $i++) {
            $u = new User;
            $u->name = $faker->name;
            $u->email = $faker->email;
            $u->password = Hash::make('password');
            $u->save();
        }

        for ($i = 0; $i < 14; $i++) {
            $e = new Evenement;
            $e->user_id = User::all()->random()->id;
            $e->name = $faker->text($maxNbChars = 16);
            $e->description = $faker->paragraph($nbSentences = 7, $variableNbSentences = true);
            $e->location = $faker->address;
            $e->save();

            for ($j = 0; $j < 4; $j++) {
                $s = new Session;
                $s->evenement_id = $e->id;
                $s->name = $faker->text($maxNbChars = 8);
                $s->start_at = $faker->dateTimeBetween($startDate = 'now', $endDate = '+1 month', $timezone = null);
                $s->end_at = $faker->dateTimeBetween($startDate = '+1 month', $endDate = '+2 month', $timezone = null);
                $s->save();
            }
        }

        for ($i = 0; $i < 250; $i++) {

            $u = new Participation();
            $u->user_id = User::all()->random()->id;
            $u->session_id = Session::all()->random()->id;
            $u->save();
        }
    }
}
