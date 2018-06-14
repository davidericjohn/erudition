# spring-boot-hibernate-basic-auth
A simple RESTful CRUD API implemented with spring-boot, hibernate, basic authentication, and h2 as its database.

# Usage

You may use any REST client available to test this application. In my case, I use Postman. Follow the link below for more details.
https://www.getpostman.com/

To start, open your command line to execute the following commands:

Compile the application
```
mvn clean package
```
Run the application 
```
java -jar spring-boot-hibernate-basic-auth
```

The application will run on port 8080 by default. You may configure this in application.properties file via property "server.port"

Use the below credentials:
```
user/password
```

Fetch all user data
```
Method: GET
URL: http://localhost:8080/users
```

Fetch user data with ID "1"
```
Method: GET
URL: http://localhost:8080/users/1
```

Create user
```
Method: POST
URL: http://localhost:8080/registers/users/
RequestBody: 
{
	"firstName" : "newfname",
	"lastName" : "newlname",
	"email" : "email@test.com"
}
```

Update user data with ID "1"
```
Method: PUT
URL: http://localhost:8080/users/1
RequestBody: 
{
	"firstName" : "updatedfname",
	"lastName" : "updatedlname",
	"email" : "email@test.com"
}
```

Delete user data with ID "1"
```
Method: DELETE
URL: http://localhost:8080/users/1
```


