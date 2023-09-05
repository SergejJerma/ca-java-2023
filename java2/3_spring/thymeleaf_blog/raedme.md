
## Build your own image using Dockerfile

### Build docker image
```bash
docker build --tag 'my_blog_app_image' .
```

### Run docker container
```bash
docker run -d -p 8080:8080 --name my_blog_container my_blog_app_image
```


### Pull image from docker repository (dockerhub)
```bash
docker pull mysql:8
```

### Run new container, based on image from docker repository (dockerhub)

```bash
docker run -e MYSQL_ROOT_PASSWORD=rootPassword mysql:8
```


