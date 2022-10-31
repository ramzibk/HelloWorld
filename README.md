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

