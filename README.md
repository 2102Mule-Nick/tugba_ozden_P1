

# Employee Management System API

## Description

The Employee Management System, EMS, provides all users to use a blog form platform. The blog form allows all users to share information such as job-related articles, 
personal development resources, and personal reflection on blog posts. Admin can run the payroll application for all employees.
Besides, the admin can create, edit, and delete employee accounts information. In addition to that, all users can create and edit their user information.

## Technologies Used

* JDK 8.0
* JDBC 
* PostgreSQL 13.0
* Spring Framework
* SpringMVC
* ActiveMQ
* Tomcat 8.5
* SOAP Engine 
* JAX-WS
* REST
* Jackson Databind
* Jackson Core 
* JMS Queues
* JMS Topic
* JTA
* JUnit5
* Log4j 


## Roles

- [x] Created four applications for EMS API with Spring Framework.
- [x] Created all Dao for applications with Spring JDBC template.
- [x] Implemented Spring MVC to host Tomcat and create the server.
- [x] Created  Employee as the main task that handled REST web service.
- [x] Connected between EmployeeMain , UserService , and Payroll aplications with REST web service.
- [x] Connected between UserService and  BlogForm  applications with SOAP web service.
- [x] Created one JMS Topic for EmployeeMain and Payroll applications to communicate.
- [x] Created one JMS Queue for two applications to communicate.

## Features

* User can create an account
* User can Login
* User can view all articles
* User can view their own accounts
* User can change their settings
* User can create and edit articles
* User can search for other articles or articles by title.
* Admin can view all user accounts
* Admin can create, edit, view and count employees. 
* Stores information about the employees in EmployeeService, as well as the users and employees associated with them, in a database.
* In EmployeeService  updates this information based on new information received from the User Service.
* BlogForm service provides end-points that allow users access to add articles.
* Jmslistener shows messages after using all EmployeeMain servise's endpoints.

###### Future Implementations of the application should address the following issues:
 
* Adding Topic on EmployeeMain for sending payroll check information to all employees.
* Adding jmslistener for the Topic on Payroll application.

# # Getting Started/Usage

In order to see this project in action, you will need a few things:

**Backend**

* Create the databese with **Script-4.sql** .
* Set up file **max_prepared_transactions property** from 0 to 10 on your **postgres.conf**
* Be sure to have **Apache Tomcat 8.5** installed
* Be sure to have **Java 8** run time environment installed
* You also need to set your tomcat to listen to port 8080

**Frontend**

* You can use **ARC** or **SOAP-UI** for endpoints testing. 

###### If all the pre-requisites above are met, clone this repo:

    https://github.com/2102Mule-Nick/tugba_ozden_P1.git    }


Tomcat server should listening on **http://localhost:8080/**

## Contributors

* Tugba Ozden





