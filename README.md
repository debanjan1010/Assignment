# Assignment

This is a simple project that would allow anyone to get up and running with Java, Maven and TestNG. It also explains how to execute a simple test that will assert/verify content from json file using testng assertion. 

Stack & Libraries
1. Java
2. TestNG
3. Maven
4. log4j

Prerequisites
1. IDE (Eclipse/IntelliJ)
2. JDK (version 7 or 8)
3. Maven configuration


Referneces
 - Setting up java in windows system https://www.examtray.com/tutorials/how-setup-java-environment-in-windows-10
 - Setting up maven https://mkyong.com/maven/how-to-install-maven-in-windows/

How to run tests
In terminal:  git clone https://github.com/debanjan1010/Assignment.git

Change directory to the location of cloned project folder and run Maven clean

 - mvn clean

To run the test
 - mvn test


Project components
 - Test json files (exmaple TeamRCB.json) are in the directory src/main/resources/
 - Test classes are in the the directory src/test/java/org/example
 - TestUtils.class containing the utility methods for reading specific data from json file are in the the directory  src/test/java/org/example/utility/


Note: For the verify team player test case to run, you must use the groups = "teamMemberValidation" for each test case. 


To see the report use the default report emailable-report.html under target folder as shown below 

<img width="232" alt="image" src="https://user-images.githubusercontent.com/39940461/186450895-a48db2a3-09b4-423b-aded-66df9fbb4dff.png">

<img width="879" alt="image" src="https://user-images.githubusercontent.com/39940461/186489786-e32136d2-a95e-4ede-9f20-c9cc63dd2f36.png">


