## Implementation

### 4 - Add Customer model, controller and service
* CustomerEntity, CustomerRegistrationRequest
* CustomerController, CustomerService

### 3 - Add module for Customer service
* dependencies: spring-boot-starter-web

### 2 - Provide dependency management in parent pom
* dependencyManagement -> dependencies:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>...</version>
    <scope>import</scope>
    <type>pom</type>        
</dependency>
``` 
* add dependencies for lombok and spring-boot-starter-test 
* build -> pluginManagement -> plugins -> plugin: spring-boot-maven-plugin

### 1 - Create Project
```shell script
mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app \
-DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false
```
