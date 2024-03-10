# Maven Quickstart Archetype - Java 21 + Spring Boot

## Summary
The project is a Maven archetype for Java 21 and Spring Boot

## Prerequisites
* JDK 21
* Maven 3

## Install Archetype Locally

To install the archetype in your local repository execute the following commands:

```bash
{
git clone https://github.com/jeremycook123/java21-springboot-archetype.git
cd java21-springboot-archetype
mvn clean install
}
```

## Maven Create/Generate New Java Project

```bash
{
mkdir proj1 && cd proj1
mvn archetype:generate \
 -DarchetypeGroupId=com.cloudacademy.devops \
 -DarchetypeArtifactId=java21-springboot-archetype \
 -DarchetypeVersion=1.0.0-SNAPSHOT \
 -DgroupId=com.example \
 -DartifactId=my-project \
 -DinteractiveMode=false
}
```
