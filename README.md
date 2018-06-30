# demoapp1
Java REST question service example

DEMO API:
https://question-java-spring.herokuapp.com/ + API URL



  Texhnologies:
- Java 8;
- Spring (Boot, Web, Data JPA(Hibernate), Security);
- Maven assembly;
- PostgreSQL database

  Requirements:
- Java 8;
- Maven ~3;
- PostgreSQL (version 10 is prefer)

  Installation:
1.) Clone this repository or download and extract source
2.) Open with IDE that support Maven (for example, Intellij IDEA, Eclipse) or run command: mvn install
3.) in file \src\main\resources\application.properties change database username and password;
4.) Run projects.

NOTE!!!
IF YOU WANT TO USE SPA(Single Page Application) client like Angular or React,
in controller files uncomment annotation @CrossOrigin and change frontend link in this annotation 
for example, for local angular app: @CrossOrigin(origins = "http://localhost:4200")


  HTTP REQUESTS:
  
  Fields:

GET: domain_name/field/list  - get all fields

GET: domain_name/field/active-list  - get all active fields (status: is Active)

POST: domain_name/field/add  - create field

GET: domain_name/field/view/:id  - get field details by field ID

PUT: domain_name/field/update - update field

DELETE: domain_name/field/delete/:id  - delete field by field ID


  Users:

GET: domain_name/user/list  - get all users

POST: domain_name/user/add  - registration (adding user)

POST: domain_name/user/auth  - find user by email and password for authentication

GET: domain_name/user/view/:id  - get user information by user ID

PUT: domain_name/user/update - update user (resave user)

DELETE: domain_name/user/delete/:id  - delete user by user ID


  Responses(Answers)
  
GET: domain_name/response/list  - get all responses

POST: domain_name/response/add  - create response

GET: domain_name/response/view/:id  - get response details by response ID

GET: domain_name/response/user-list/:user-id  - get response details by User ID

PUT: domain_name/response/update - update response

DELETE: domain_name/response/delete/:id  - delete response by response ID
