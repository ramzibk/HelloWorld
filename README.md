# HelloWorld
an over engineered Hello World microservice

### build the image and assign it the tag hello-world-app
$ docker build -t hello-world-app .

### list all images inside docker
docker image ls

### run the container and bind port 8080 of the container to port 8080 of the host 
$ docker run -p 8080:8080  hello-world-app

### list all containers in docker
docker container ls

### execute bash inside the container
docker exec -it CONTAINER_NAME bash

### run locally 
./gradlew bootRun

### send a get request
curl -G http://localhost:8080/api/hello -d name=ramzi -d age=30

### view the api documentation (after running the application)
http://localhost:9090/actuator/swagger-ui/index.html


