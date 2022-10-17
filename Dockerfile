#telecom-expense-recovery-management API Dockerfile
FROM maven:3.3.9-jdk-8-alpine AS maven_build
#FROM registry.cirrus.ibm.com/rre-cirrus/rre-java8-maven-image:latest AS maven_build
# Aritfactory
ARG ARTIFACT_USER
ARG ARTIFACT_PWD
ENV ARTIFACT_USER ${ARTIFACT_USER}
ENV ARTIFACT_PWD ${ARTIFACT_PWD}

# telecom-expense-recovery-management API Maven package
# @Input The path of application need to edit.
COPY . /tmp/fss_shadow
RUN cd /tmp/fss_shadow && mvn clean install -Dmaven.test.skip=true -Dmaven.javadoc.skip=true -Duser.timezone=UTC

# telecom-expense-recovery-management Jdk
#FROM openjdk:8-jdk
FROM registry.cirrus.ibm.com/public/openjdk-8:latest

USER root:root

RUN microdnf update

# @Input The name of jar need to edit.
COPY --from=maven_build /tmp/fss_shadow/target/portal-server-0.0.1-SNAPSHOT.jar /fss_shadow/app.jar

RUN chgrp -R 0 /fss_shadow && chmod -R g=u /fss_shadow 

# telecom-expense-recovery-management Volume
VOLUME ["/cmapsLogs"]

# Set USER for Openshift (If the Dockerfile is for K8S, Please remove this line)
USER 1001

# Expose port
EXPOSE 8081

# Set workdir for call-detail-record-services-app
WORKDIR /fss_shadow/

# ENTRYPOINT
ENTRYPOINT java -Duser.timezone=UTC -jar app.jar
