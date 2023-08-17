# Demo servlet application
Just to show how stuff used to be done the semi old way
- archiving our code into `.war` (web archive)
- loading it into a web server

### Why the _old way_ is not my favourite
#### Servlets
- Routing servlets is a really odl stuff that's rather tedious
- Swinging from java to xml and back just does not feel right when developing
#### Enterprise servers
- Magic might happen when you decide to upgrade provided dependencies - something might start/stop working... \
  And unit test probably won't help you.
- Any ideas what (dependencies) the server provides you? (Probably not...)
- Will your code run when your company decides to upgrade version of your server? "I hope so..."
- Not every enterprise server is easy to pack into a docker container 
  thus sometimes you might be forced to use shared test environment(s). Not everyone likes sharing...

### URL to reach our endpoint (servlet url)
http://localhost:8080/servlet_demo/hello-servlet/whatever/you/type