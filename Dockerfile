FROM openjdk:13-alpine

EXPOSE 8080

ENV HOME /usr/src/app

ENV TZ=America/Los_Angeles 

RUN mkdir -p /usr/src/app

COPY ./target/*.war /usr/src/app/webservices.war

RUN apk add --no-cache tzdata \
	&& adduser --disabled-password -G root -s /bin/sh -D webservice \
	&& ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone \ 
	&& chmod -R 775 /usr/src/app \
	&& chown -R webservice:root /usr/src/app \
	&& ls -la /usr/src/app
	
WORKDIR /usr/src/app
	
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/usr/src/app/webservices.war", ">/tmp/out.logps -e"]