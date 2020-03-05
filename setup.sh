chown -R $USER:www-data storage
chown -R $USER:www-data bootstrap/cache
chown -R $USER:www-data database
chown -R $USER:www-data database/database/sqlite.sqlite

chmod -R 775 storage
chmod -R 775 bootstrap/cache
chmod -R 775 database
chmod -R 775 database/database/sqlite.sqlite

composer install
npm install
npm run dev

php artisan down

cp .env.example .env
php artisan key:generate

touch database/database.sqlite
php artisan migrate:fresh

php artisan cache:clear

php artisan up