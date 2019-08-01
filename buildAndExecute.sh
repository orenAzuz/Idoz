echo build Docker files
cd chackYodaFront
docker build -t chack-yoda-front .
cd ..
cd ChuckYodis
docker build -t chack-yodis-back .
cd ..
docker build -t chack-yoda-db .
docker-compose up -d
sleep 1
echo Initianl data ...
docker exec mongo mongorestore --db ChackYoda --drop ./ChackYoda

echo done!!!!
