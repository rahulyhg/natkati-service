# natkati-service
Service to provide cloud data for Natkati Android App

## System Requirements

To build or run the project, you MUST have a copy of Java JDK 8 on your machine. 
After installing or unzipping the Java JDK, one of the following environment variables must be configured:
  (1) set JAVA_HOME to point to your JDK installation directory
  (2) JDK bin directory is added on your PATH

## Clone the project into local 
Cloning the project is a one time activity.  Once cloned the local repository can be used for further development

Copy the HTTPS Git repository URL, open command prompt and switch to the folder of your choice (eg:- C:\Workspace\SDWorkSpace) and clone the repository
```
git clone https://github.com/SmartDroidies/natkati-service.git
```  
 
## Build & Run Project (In Windows Command Prompt)

Get into the project folder and build using gradlew
```
cd natkati-service
gradlew build
```

Run the application using command prompt 
```
gradlew bootRun
```

## Deploy to PCF
Follow the below instructions to deploy the service to cloud foundry

Create a clean build from the command prompt
```
..\natkati-service> gradlew clean build
``` 

Verify that you are intended target foundry, org and space
```
cf target
```

Push the application using the corresponding manifest file 
```
cf push -f {MANIFEST-ENV} -p {APP_VERSION_JAR} 
```

Example for dev environment 
```
cf push -f manifest.yml -p application\build\libs\natkati-service.jar
``` 
   
 

 
