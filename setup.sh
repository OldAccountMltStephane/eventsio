chown -R $USER:www-data storage
chown -R $USER:www-data bootstrap/cache
chown -R $USER:www-data database
chown -R $USER:www-data database/database.sqlite

chmod -R 775 storage
chmod -R 775 bootstrap/cache
chmod -R 775 database
chmod -R 775 database/database.sqlite

composer install
npm install
npm run dev

php artisan down

cp .env.example .env
php artisan key:generate

touch database/database.sqlite
php artisan migrate:refresh --seed

php artisan cache:clear

php artisan up