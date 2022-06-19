FROM ubuntu:20.04
ENV JAVA_HOME=/u01/middleware/jdk-11
ENV PATH=${PATH}:${JAVA_HOME}/bin
RUN mkdir -p /u01/middleware/
RUN mkdir -p /u01/applications/
WORKDIR /u01/middleware
#RUN cd /u01/middleware
ADD https://download.java.net/openjdk/jdk11/ri/openjdk-11+28_linux-x64_bin.tar.gz /u01/applications
RUN tar -xzvf /u01/applications/openjdk-11+28_linux-x64_bin.tar.gz
RUN rm /u01/applications/openjdk-11+28_linux-x64_bin.tar.gz

WORKDIR /u01/applications
COPY target/tokengenerator-1.0.jar /u01/applications
CMD java -cp /u01/applications/tokengenerator-1.0.jar com.tg.service.TokenGeneratorService
