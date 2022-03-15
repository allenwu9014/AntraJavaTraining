# Java Advanced CheckList

Java Core CheckList [Link](/Java-Core/Java-Core-CheckList.md)</br>

**Databases** 

- SQL
    - Query
    - Relationship
    - Constraints
    - View
    - Transaction
- JDBC
    - Driver
    - Connection
    - Statement
    - PrepareStatement
    - ResultSet
- NO-SQL
    - MongoDB
    - Redis
</br>[Database Summary P1](/Java-Advanced/DB1.pdf)</br>
</br>[Database Summary P2](/Java-Advanced/DB2.pdf)</br>
</br>[Database Summary P3](/Java-Advanced/DB3.pdf)</br>
**ORM** 

*Object relational mapping*

- Easy to use.
Table->Class
Column->Fields
Row(Record)->Object
- JPA
    
    *Java Persistence API is a JavaEE specification. It declares a way for JavaEE applications to implement ORM to any relational databases.*
    
    - Mapping
        - e.g. @Entity @Table @Column @Id @ManyToOne @OneToMany @OneToOne @ManyToMany
    - EntityManager
        - Main API to interact with the entities and database
        - Basic find, save, merge methods.
        - Execute JPQL and SQL
        - Mapping sql results to Java entity objects
    - Query
        - JPQL is similar to SQL. It is focusing on Entity class instead of tables.
    - Criteria API
        - A programmatic way of assembly queries instead of writing "select..."-kind of queries.
    - Cascade
        - Operations on one Entity object will(or will not) be propagated to the associated object.
        Can be changed from Entity Mapping level.
    - Fetch/Load Type
        - If one course is read out, will(or will not) the students associated with this course be read
        out of DB.
- Hibernate
    - Session
        - Session is similar to EntityManger. It provides more functions and it is only available for Hibernate API.
    - Cache

**Networking**

- OSI Model
- TCP
    - Socket
        - Java provides socket api for low level communication.
- HTTP
    - Request
    - Response
        - Status Code( 2xx success,3xx redirect,4xx client error,5xx server error)
- WebSocket
    - STOMP
    - SocketJS

**Java EE** 

- Servlet
    
    *To handle the request from the client, process the request and then send back the response.Mainly used for HTTP protocol. Java Web Servers manage the lift cycle of Servlet.* 
    
    eg. Tomcat creates and destroys the Servlet objects.
    
    - HTTPServlet
    - HttpServletRequest
    - HttpServletResponse
    - HttpSession
        - By using sessionId saved in cookies(or url or hidden fields in HTML), the server can associate the existing HttpSession object to the incoming request.
        - Not recommended due to the popularity of stateless servers.
    - Filter
        - Filter acts like a pre and post processor to the requests before the HTTPServletRequest gets sent to the Servlet class.
- JPA
- JAX-B
    - Used for XML-Java Object conversion.
    - It is useful for XML processing and validation.
- JAX-RS
    - JavaEE specification regarding RESTful web services.
    - Not as popular as SpringBoot/Spring MVC.

**Spring** 

- IOC/DI (→Summary)
    
    *To make the code loosely coupled.*
    
    - Container
    - Factory
    - Context
    - Loose Coupling
- AOP (→Summary)
    
    *The solution for cross-cutting concerns.*
    
    - Aspect
    - Advice
    - PointCut
    - JoinPoint
- Spring Boot
    - Auto-Configuration
    - Embedded Server
        - The web starter comes with Tomcat
    - Self-Executable Jar
        - Build a fat jar file with everything in it
        - java -jar xxx.jar
    - Starter
        - Pre-defined dependencies which can provide a specific function without conflicts and compatibility issues.
    - Actuator
        - Monitoring module for Spring Boot application

**Web Services** 

- REST
    - Producer
        - Should define RequestMapping, HTTP method, URI, Request and Response Body, Parameters, Validation, Errors, Authorization
    - Consumer
        - RestTemplate class in Spring.
    - Verbs
        - GET, POST, PUT, DELETE, PATCH, OPTIONS
    - URI
        - The resource identifier
    - Payload
        - ?
    - Header
        - Declare the meta-data about the request.
    - Security
        - HTTPS to ensure data security in transit.
        - Token based Authentication/Authorization.
    - Document
        - Swagger
        - Coordinate front and back
    - Test
        - PostMan
        - JUnit

---

- SOAP
    
    *Simple Object Access Protocol(SOAP) is a XML based information exchange web service.*
    
    - XML
    - WSDL
        - Used to define the messages used to exchange the information like endpoints, ports, parameters, types, operations etc.
- Spring Web MVC
    
    !SpringBoot uses Spring MVC internally.
    
    - Annotations
    
    **Application Architectures** 
    
    - MVC Pattern
    - Frontend-backend Separation
        
        *Backend servers data to frontend through APIs using JSON and other formats.*
        
        - Frontend Technologies
            - Angular
            - React
        - Ajax
            - Front-end use Ajax send request/ axios
        - Communication
            - HTTP
                - WebSocket
    
- 3-tier Architecture
    - Web Layer
        - Communication with clients using network protocols like HTTP, websocket
    - Service Layer
        - Business Logic
    - Data Layer
        - Data Access, CRUD operations to DB
- Monolithic
    
    *Everything in one package.* 
    
    - SOA (Service-Oriented Architecture)
        - Focusing on interaction and integration between independent services, usually using a service bus, SOAP or messaging system.
    - ESB
        - In SOA, an enterprise service bus(ESB) acts as a center control of the
        communication and integration between the services.
- Microservices
    
    *Split the application into tiny little services and then link them together using distributed communication, like http, service discovery, load balancing and api gateway.*
    
    Flexible
    
    Loosely coupled
    
    Resilient
    
    - Service Discovery
        - Eureka
    - Communication
        - HTTP
    - Log Tracing
        - Sleuth
        - ZipKin
    - Config Server
        - Spring Config Server can be used for centralizing all the configuration files for each service, also for every environment
    - Fault Tolerance
        - Resilience4j

**Cloud/AWS** (AWS Summary)

- IAAS
    - Infrastructure as a service
- PAAS
    - Platform as a service
- SAAS
    - Software as a service
- AWS
    - EC2, S3, SQS, SNS, Lambda, RDS, ECS, ECR

**Security** 

- Authentication
    - The process of checking validity of a user or request.
- Authorization
    - To give someone the permission to do some actions.
- Encryption
    - Symmetric
        - Same key for encryption and decryption.
    - Asymmetric
- Hashing
    - MD5
    - SHA
- Encoding
    - URLEncode
    - FileEncode
- Spring Security
    - A customizable authentication and authorization framework used by spring applications.
    - oauth
    - sso
    - ldap
- HTTPS
    - The Secured HTTP
- JWT
    - Json Web Token
- OAUTH2
    - Open Authorization 2.0
- SSO
- SAML

**Messaging System** (MS → Summary)

- JMS
    - Queue
    - Topic
- AMQP
    - Exchange
- Apache Kafka
    - Partition
    - Topic