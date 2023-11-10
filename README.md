# twitter_app

Install java and eclipse 


install mysql 

linux@linux:~/Downloads/eclipse$ sudo apt install mysql-server
linux@linux:~/Downloads/eclipse$ sudo systemctl start mysql 
linux@linux:~/Downloads/eclipse$ sudo systemctl enable mysql 
Synchronizing state of mysql.service with SysV service script with /lib/systemd/systemd-sysv-install.
Executing: /lib/systemd/systemd-sysv-install enable mysql

linux@linux:~/Downloads/eclipse$ sudo mysql -u root -p 
Enter password: 
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 8
Server version: 8.0.35-0ubuntu0.22.04.1 (Ubuntu)

Copyright (c) 2000, 2023, Oracle and/or its affiliates.

Oracle is a registered trademark of Oracle Corporation and/or its
affiliates. Other names may be trademarks of their respective
owners.

Type 'help;' or '\h' for help. Type '\c' to clear the current input statement.

mysql> CREATE DATABASE twitter_app;
Query OK, 1 row affected (0.03 sec)

mysql> SHOW DATABASES;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| mysql              |
| performance_schema |
| sys                |
| twitter_app        |
+--------------------+
5 rows in set (0.04 sec)

mysql> USE twitter_app;
Database changed







in eclipse download the spring plugin 



then change the application.properties file

if you see this erro:

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
[2m2023-11-09T20:31:22.238Z[0;39m [31mERROR[0;39m [35m5020[0;39m [2m---[0;39m [2m[  restartedMain][0;39m [36mo.s.boot.SpringApplication              [0;39m [2m:[0;39m Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'jdbcSessionDataSourceScriptDatabaseInitializer' defined in class path resource [org/springframework/boot/autoconfigure/session/JdbcSessionConfiguration.class]: Failed to instantiate [org.springframework.boot.autoconfigure.session.JdbcSessionDataSourceScriptDatabaseInitializer]: Factory method 'jdbcSessionDataSourceScriptDatabaseInitializer' threw exception with message: Failed to determine DatabaseDriver
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:654) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:642) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1332) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1162) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:560) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:325) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:323) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:312) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:199) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1166) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:940) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:616) ~[spring-context-6.0.13.jar:6.0.13]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:738) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:440) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:316) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1306) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1295) ~[spring-boot-3.1.5.jar:3.1.5]
	at cst.assignment.twitter.TwitterApplication.main(TwitterApplication.java:10) ~[classes/:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.boot.devtools.restart.RestartLauncher.run(RestartLauncher.java:50) ~[spring-boot-devtools-3.1.5.jar:3.1.5]
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [org.springframework.boot.autoconfigure.session.JdbcSessionDataSourceScriptDatabaseInitializer]: Factory method 'jdbcSessionDataSourceScriptDatabaseInitializer' threw exception with message: Failed to determine DatabaseDriver
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:171) ~[spring-beans-6.0.13.jar:6.0.13]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:650) ~[spring-beans-6.0.13.jar:6.0.13]
	... 26 common frames omitted
Caused by: java.lang.IllegalStateException: Failed to determine DatabaseDriver
	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.getDatabaseDriver(PlatformPlaceholderDatabaseDriverResolver.java:144) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.determinePlatform(PlatformPlaceholderDatabaseDriverResolver.java:132) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.lambda$resolveAll$0(PlatformPlaceholderDatabaseDriverResolver.java:97) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:122) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.resolveAll(PlatformPlaceholderDatabaseDriverResolver.java:97) ~[spring-boot-3.1.5.jar:3.1.5]
	at org.springframework.boot.autoconfigure.session.JdbcSessionDataSourceScriptDatabaseInitializer.resolveSchemaLocations(JdbcSessionDataSourceScriptDatabaseInitializer.java:86) ~[spring-boot-autoconfigure-3.1.5.jar:3.1.5]
	at org.springframework.boot.autoconfigure.session.JdbcSessionDataSourceScriptDatabaseInitializer.getSettings(JdbcSessionDataSourceScriptDatabaseInitializer.java:74) ~[spring-boot-autoconfigure-3.1.5.jar:3.1.5]
	at org.springframework.boot.autoconfigure.session.JdbcSessionDataSourceScriptDatabaseInitializer.<init>(JdbcSessionDataSourceScriptDatabaseInitializer.java:48) ~[spring-boot-autoconfigure-3.1.5.jar:3.1.5]
	at org.springframework.boot.autoconfigure.session.JdbcSessionConfiguration.jdbcSessionDataSourceScriptDatabaseInitializer(JdbcSessionConfiguration.java:65) ~[spring-boot-autoconfigure-3.1.5.jar:3.1.5]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:139) ~[spring-beans-6.0.13.jar:6.0.13]
	... 27 common frames omitted
Caused by: org.springframework.jdbc.support.MetaDataAccessException: Could not get Connection for extracting meta-data
	at org.springframework.jdbc.support.JdbcUtils.extractDatabaseMetaData(JdbcUtils.java:362) ~[spring-jdbc-6.0.13.jar:6.0.13]
	at org.springframework.boot.jdbc.init.PlatformPlaceholderDatabaseDriverResolver.getDatabaseDriver(PlatformPlaceholderDatabaseDriverResolver.java:140) ~[spring-boot-3.1.5.jar:3.1.5]
	... 40 common frames omitted
Caused by: org.springframework.jdbc.CannotGetJdbcConnectionException: Failed to obtain JDBC Connection
	at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:84) ~[spring-jdbc-6.0.13.jar:6.0.13]
	at org.springframework.jdbc.support.JdbcUtils.extractDatabaseMetaData(JdbcUtils.java:336) ~[spring-jdbc-6.0.13.jar:6.0.13]
	... 41 common frames omitted
Caused by: java.sql.SQLException: Access denied for user 'root'@'localhost'
	at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:130) ~[mysql-connector-j-8.0.33.jar:8.0.33]
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122) ~[mysql-connector-j-8.0.33.jar:8.0.33]
	at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:825) ~[mysql-connector-j-8.0.33.jar:8.0.33]
	at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:446) ~[mysql-connector-j-8.0.33.jar:8.0.33]
	at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:239) ~[mysql-connector-j-8.0.33.jar:8.0.33]
	at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:188) ~[mysql-connector-j-8.0.33.jar:8.0.33]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar:na]
	at org.springframework.jdbc.datasource.DataSourceUtils.fetchConnection(DataSourceUtils.java:160) ~[spring-jdbc-6.0.13.jar:6.0.13]
	at org.springframework.jdbc.datasource.DataSourceUtils.doGetConnection(DataSourceUtils.java:118) ~[spring-jdbc-6.0.13.jar:6.0.13]
	at org.springframework.jdbc.datasource.DataSourceUtils.getConnection(DataSourceUtils.java:81) ~[spring-jdbc-6.0.13.jar:6.0.13]
	... 42 common frames omitted




CREATE USER twitter@'localhost' IDENTIFIED BY '123456';

GRANT ALL ON twitter_app.* TO twitter@'localhost';

spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/twitter_app
spring.datasource.username=twitter
spring.datasource.password=123456
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect


run below in the mysql command:

CREATE TABLE SPRING_SESSION (
	PRIMARY_ID CHAR(36) NOT NULL,
	SESSION_ID CHAR(36) NOT NULL,
	CREATION_TIME BIGINT NOT NULL,
	LAST_ACCESS_TIME BIGINT NOT NULL,
	MAX_INACTIVE_INTERVAL INT NOT NULL,
	EXPIRY_TIME BIGINT NOT NULL,
	PRINCIPAL_NAME VARCHAR(100),
	CONSTRAINT SPRING_SESSION_PK PRIMARY KEY (PRIMARY_ID)
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC;

CREATE UNIQUE INDEX SPRING_SESSION_IX1 ON SPRING_SESSION (SESSION_ID);
CREATE INDEX SPRING_SESSION_IX2 ON SPRING_SESSION (EXPIRY_TIME);
CREATE INDEX SPRING_SESSION_IX3 ON SPRING_SESSION (PRINCIPAL_NAME);

CREATE TABLE SPRING_SESSION_ATTRIBUTES (
	SESSION_PRIMARY_ID CHAR(36) NOT NULL,
	ATTRIBUTE_NAME VARCHAR(200) NOT NULL,
	ATTRIBUTE_BYTES BLOB NOT NULL,
	CONSTRAINT SPRING_SESSION_ATTRIBUTES_PK PRIMARY KEY (SESSION_PRIMARY_ID, ATTRIBUTE_NAME),
	CONSTRAINT SPRING_SESSION_ATTRIBUTES_FK FOREIGN KEY (SESSION_PRIMARY_ID) REFERENCES SPRING_SESSION(PRIMARY_ID) ON DELETE CASCADE
) ENGINE=InnoDB ROW_FORMAT=DYNAMIC;




*************************** APPLICATION FAILED TO START *************************** Description: Web server failed to start. Port 8080 was already in use. Action: Identify and stop the process that's listening on port 8080 or configure this application to listen on another port. 


linux@linux:~$ sudo lsof -i :8080
[sudo] password for linux: 
COMMAND  PID  USER   FD   TYPE DEVICE SIZE/OFF NODE NAME
java    2531 linux  154u  IPv6  31369      0t0  TCP *:http-alt (LISTEN)
linux@linux:~$ sudo kill -9 2531



enable logging 
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/twitter_app
spring.datasource.username=twitter
spring.datasource.password=123456
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
logging.level.org.springframework.security: DEBUG
