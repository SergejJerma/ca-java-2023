
### Build docker image
```bash
docker build --tag 'my_blog_app_image' .
```

### Run docker container
```bash
docker run -d -p 8080:8080 --name my_blog_container my_blog_app_image
```
