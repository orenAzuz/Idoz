# Idoz Chuck-Yoda project.

Watch the project alive on google cloud: http://34.67.58.237/
The project sits on a kubernetes cluster and consists of three servers.
Front-end on alpine/nginx Back-end alpine/java and the db alpine/mongodb. 

# Usage For docker, docker-compose.

Ther is an execute file name buildAndExecute.sh this file will build all docker images and run the docker-compose up
and initiate the data.
the application will listen on localhost:80.

# To run it on local machine

Note: if you would like to serve the project localic you should make sure that in the service.ts file URL 
field matches to the URL that the server listing.

