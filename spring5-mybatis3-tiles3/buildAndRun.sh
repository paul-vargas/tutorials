#!/bin/sh
mvn clean package && docker build -t org.paulvargas.tutorials/spring5-mybatis3-tiles3 .
docker rm -f spring5-mybatis3-tiles3 || true && docker run -d -p 8080:8080 -p 4848:4848 --name spring5-mybatis3-tiles3 org.paulvargas.tutorials/spring5-mybatis3-tiles3 
