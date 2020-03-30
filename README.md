# SpringRestFul
Spring project for REST endpoint exposure using spring security 

# Steps to Check 

- Make sure you have cloned the project into the local system  
- **(Kindly Note)** Make sure mvn -version is working 
- run on cmd : mvn clean install package
- run on cmd : java -jar target/assignment-0.0.1-SNAPSHOT.jar

### Credentials (need to be updated in postman Authorization, basic Auth)
- username : user1
- password : password1
- username : user2
- password : password2 
### Endpoints 
- POST : http://localhost:8080/user
- GET : http://localhost:8080/users
- PUT : http://localhost:8080/user
- DELETE : http://localhost:8080/user

##### Payload

       {
    	    "username": "User4",
    	    "password": "password6",
    	    "status": "Activated"
    	}

## For Checking the Database value(here we are using H2)

- Go to http://localhost:8080/h2-console/
- JDBC url : jdbc:h2:mem:testdb 
- UserName : sa
- Password : 
