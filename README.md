## Task 1 - Set up the connection
### The h2 database dependency should be already in your pom.xml file 



<dependency>
	<groupId>com.h2database</groupId>
	<artifactId>h2</artifactId>
	<scope>runtime</scope>
</dependency>

<br>


By default, Spring Boot configures the application to connect to an in-memory store with the username sa and an empty password. This can be changed using in application.properties file which is located in the resources folder of your main folder. We are leveraging Spring Boot’s convention over configuration approach. Spring Boot would read the additional setup from the mentioned application.properties file. If the file has a different name, or is stored in a different location, the set up will fail. Here, we are enabling the h2 browser-based console and changing the password.
<br>

spring.datasource.url=jdbc:h2:mem:testdb <br>
spring.datasource.driverClassName=org.h2.Driver <br>
spring.h2.console.enabled=true <br>
spring.datasource.username=sa <br>
spring.datasource.password=password <br>
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect <br>
spring.jpa.defer-datasource-initialization=true <br>
Run your Spring Boot application, open your browser and navigate to localhost:8080/h2-console . <br>

<br>

Make sure you use the changed password and the correct datasource URL. As per the application.properties, it should be jdbc:h2:mem:testdb.
<br>
<br>
<br>
![image](https://github.com/user-attachments/assets/431a1d19-19c7-4869-87d6-78c325918df8)

<br>
<br>
<br>
<img width="545" alt="image" src="https://github.com/user-attachments/assets/ebf10449-5857-4177-a48f-7b3a68ac241c">
<br>
<br>
<br>
<img width="647" alt="image" src="https://github.com/user-attachments/assets/8628cd32-06ad-4f21-818f-aa3922111ae9">

<br>
<br>
<br>

![image](https://github.com/user-attachments/assets/403e392d-7c9f-433e-9908-b3a010ec7910)


<br>
<br>
<br>

<img width="1170" alt="image" src="https://github.com/user-attachments/assets/26dcb641-546b-47b1-b138-3b89892dd2a9">

