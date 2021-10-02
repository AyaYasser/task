Maria DB is used .
One service is implemented and other services will be discussed in the interview and if I based java interview I will start in Angular task (As I applied for Full stack)

To run the application 
1. Make sure that you have a maria database is running and please check database configuration in application.properties
2. Run scripts in create.sql
3. Make build --> mvn clean install 
4. Run application --> java -jar tennis-0.0.1-SNAPSHOT.jar

Test webservice
================
URL = http://localhost:8080/tennis/add/participant
Request
--------
{
    "staffId": 5678,
    "username": "aya"
}

Response
---------
{
    "messageCode": 0,
    "messageDescr": "SUCCESS"
}
