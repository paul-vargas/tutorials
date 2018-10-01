#!/bin/sh
mvn clean package && docker build -t org.paulvargas.tutorials/spring-client-datetime-mssql .
docker rm -f spring-client-datetime-mssql || true && docker run -d -p 8080:8080 -p 4848:4848 --name spring-client-datetime-mssql org.paulvargas.tutorials/spring-client-datetime-mssql 
