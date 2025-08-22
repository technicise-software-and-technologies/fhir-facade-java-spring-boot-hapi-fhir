rce]: Factory method 'dataSource' threw exception with message: Failed to determine a suitable driver class
2025-08-22T17:37:29.679+05:30  INFO 146308 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-08-22T17:37:29.697+05:30  INFO 146308 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-08-22T17:37:29.717+05:30 ERROR 146308 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
        If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
        If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).

chandra@chandra-latitude-ubuntu22:~/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade$  cd /home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade ; /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_3azoqo6wo2rkg3nhmty6qmiqk.argfile payroll.PayrollApplication 
Error: Could not find or load main class payroll.PayrollApplication
Caused by: java.lang.ClassNotFoundException: payroll.PayrollApplication
chandra@chandra-latitude-ubuntu22:~/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade$  cd /home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade ; /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_3azoqo6wo2rkg3nhmty6qmiqk.argfile payroll.PayrollApplication 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.0)

2025-08-22T17:52:31.243+05:30  INFO 161492 --- [           main] payroll.PayrollApplication               : Starting PayrollApplication using Java 17.0.16 with PID 161492 (/media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade/target/classes started by chandra in /media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade)
2025-08-22T17:52:31.248+05:30  INFO 161492 --- [           main] payroll.PayrollApplication               : No active profile set, falling back to 1 default profile: "default"
2025-08-22T17:52:32.316+05:30  INFO 161492 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-08-22T17:52:32.385+05:30  INFO 161492 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 60 ms. Found 1 JPA repository interfaces.
2025-08-22T17:52:32.923+05:30  INFO 161492 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8080 (http)
2025-08-22T17:52:32.933+05:30  INFO 161492 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-22T17:52:32.933+05:30  INFO 161492 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]
2025-08-22T17:52:33.046+05:30  INFO 161492 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-22T17:52:33.048+05:30  INFO 161492 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1730 ms
2025-08-22T17:52:33.200+05:30  INFO 161492 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-08-22T17:52:33.478+05:30  INFO 161492 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@6b649efa
2025-08-22T17:52:33.479+05:30  INFO 161492 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-08-22T17:52:33.526+05:30  INFO 161492 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-08-22T17:52:33.591+05:30  INFO 161492 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.2.Final
2025-08-22T17:52:33.593+05:30  INFO 161492 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2025-08-22T17:52:33.747+05:30  INFO 161492 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T17:52:33.862+05:30  INFO 161492 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-08-22T17:52:33.926+05:30  INFO 161492 --- [           main] org.hibernate.orm.dialect                : HHH035001: Using dialect: org.hibernate.dialect.PostgreSQLDialect, version: org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$DialectResolutionInfoImpl@22da200e
2025-08-22T17:52:34.093+05:30  INFO 161492 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T17:52:34.582+05:30  INFO 161492 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2025-08-22T17:52:34.585+05:30  INFO 161492 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-08-22T17:52:34.844+05:30  WARN 161492 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-08-22T17:52:35.205+05:30  WARN 161492 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.context.ApplicationContextException: Failed to start bean 'webServerStartStop'
2025-08-22T17:52:35.207+05:30  INFO 161492 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2025-08-22T17:52:35.208+05:30  INFO 161492 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-08-22T17:52:35.222+05:30  INFO 161492 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2025-08-22T17:52:35.225+05:30  INFO 161492 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-08-22T17:52:35.239+05:30  INFO 161492 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-08-22T17:52:35.258+05:30 ERROR 161492 --- [           main] o.s.b.d.LoggingFailureAnalysisReporter   : 

***************************
APPLICATION FAILED TO START
***************************

Description:

Web server failed to start. Port 8080 was already in use.

Action:

Identify and stop the process that's listening on port 8080 or configure this application to listen on another port.

chandra@chandra-latitude-ubuntu22:~/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade$  cd /home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade ; /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_3azoqo6wo2rkg3nhmty6qmiqk.argfile payroll.PayrollApplication 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.0)

2025-08-22T17:53:42.707+05:30  INFO 162474 --- [           main] payroll.PayrollApplication               : Starting PayrollApplication using Java 17.0.16 with PID 162474 (/media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade/target/classes started by chandra in /media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade)
2025-08-22T17:53:42.711+05:30  INFO 162474 --- [           main] payroll.PayrollApplication               : No active profile set, falling back to 1 default profile: "default"
2025-08-22T17:53:43.386+05:30  INFO 162474 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-08-22T17:53:43.453+05:30  INFO 162474 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 54 ms. Found 1 JPA repository interfaces.
2025-08-22T17:53:43.983+05:30  INFO 162474 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
2025-08-22T17:53:43.997+05:30  INFO 162474 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-22T17:53:43.997+05:30  INFO 162474 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]
2025-08-22T17:53:44.104+05:30  INFO 162474 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-22T17:53:44.106+05:30  INFO 162474 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1323 ms
2025-08-22T17:53:44.245+05:30  INFO 162474 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-08-22T17:53:44.504+05:30  INFO 162474 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@36068727
2025-08-22T17:53:44.505+05:30  INFO 162474 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-08-22T17:53:44.562+05:30  INFO 162474 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-08-22T17:53:44.620+05:30  INFO 162474 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.2.Final
2025-08-22T17:53:44.623+05:30  INFO 162474 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2025-08-22T17:53:44.733+05:30  INFO 162474 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T17:53:44.832+05:30  INFO 162474 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-08-22T17:53:44.886+05:30  INFO 162474 --- [           main] org.hibernate.orm.dialect                : HHH035001: Using dialect: org.hibernate.dialect.PostgreSQLDialect, version: org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$DialectResolutionInfoImpl@f03ee8f
2025-08-22T17:53:45.041+05:30  INFO 162474 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T17:53:45.521+05:30  INFO 162474 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2025-08-22T17:53:45.523+05:30  INFO 162474 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-08-22T17:53:45.762+05:30  WARN 162474 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-08-22T17:53:46.118+05:30  INFO 162474 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2025-08-22T17:53:46.127+05:30  INFO 162474 --- [           main] payroll.PayrollApplication               : Started PayrollApplication in 3.901 seconds (process running for 4.247)
2025-08-22T17:53:46.183+05:30  WARN 162474 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 0, SQLState: 42P01
2025-08-22T17:53:46.183+05:30 ERROR 162474 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : ERROR: relation "employee_seq" does not exist
  Position: 16
2025-08-22T17:53:46.196+05:30  INFO 162474 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-08-22T17:53:46.212+05:30 ERROR 162474 --- [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalStateException: Failed to execute CommandLineRunner
        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:773) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:754) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1305) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1294) ~[spring-boot-3.1.0.jar:3.1.0]
        at payroll.PayrollApplication.main(PayrollApplication.java:10) ~[classes/:na]
Caused by: org.springframework.dao.InvalidDataAccessResourceUsageException: could not extract ResultSet [ERROR: relation "employee_seq" does not exist
  Position: 16] [n/a]; SQL [n/a]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:256) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:229) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:550) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:163) ~[spring-data-jpa-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:223) ~[spring-aop-6.0.9.jar:6.0.9]
        at payroll.$Proxy108.save(Unknown Source) ~[na:na]
        at payroll.LoadDatabase.lambda$0(LoadDatabase.java:18) ~[classes/:na]
        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:770) ~[spring-boot-3.1.0.jar:3.1.0]
        ... 5 common frames omitted
Caused by: org.hibernate.exception.SQLGrammarException: could not extract ResultSet [ERROR: relation "employee_seq" does not exist
  Position: 16] [n/a]
        at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:89) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.extract(ResultSetReturnImpl.java:67) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.SequenceStructure$1.getNextValue(SequenceStructure.java:102) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.PooledOptimizer.generate(PooledOptimizer.java:72) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.SequenceStyleGenerator.generate(SequenceStyleGenerator.java:542) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.IdentifierGenerator.generate(IdentifierGenerator.java:147) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.AbstractSaveEventListener.saveWithGeneratedId(AbstractSaveEventListener.java:120) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.entityIsTransient(DefaultPersistEventListener.java:175) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.persist(DefaultPersistEventListener.java:93) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:77) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:54) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:127) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.internal.SessionImpl.firePersist(SessionImpl.java:755) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.internal.SessionImpl.persist(SessionImpl.java:739) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:569) ~[na:na]
        at org.springframework.orm.jpa.SharedEntityManagerCreator$SharedEntityManagerInvocationHandler.invoke(SharedEntityManagerCreator.java:311) ~[spring-orm-6.0.9.jar:6.0.9]
        at jdk.proxy2/jdk.proxy2.$Proxy105.persist(Unknown Source) ~[na:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.save(SimpleJpaRepository.java:637) ~[spring-data-jpa-3.1.0.jar:3.1.0]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:569) ~[na:na]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker$RepositoryFragmentMethodInvoker.lambda$new$0(RepositoryMethodInvoker.java:288) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker.doInvoke(RepositoryMethodInvoker.java:136) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker.invoke(RepositoryMethodInvoker.java:120) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.invoke(RepositoryComposition.java:516) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:285) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.invoke(RepositoryFactorySupport.java:628) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.doInvoke(QueryExecutorMethodInterceptor.java:168) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.invoke(QueryExecutorMethodInterceptor.java:143) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:77) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:123) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:391) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137) ~[spring-tx-6.0.9.jar:6.0.9]
        ... 14 common frames omitted
Caused by: org.postgresql.util.PSQLException: ERROR: relation "employee_seq" does not exist
  Position: 16
        at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2734) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.core.v3.QueryExecutorImpl.processResults(QueryExecutorImpl.java:2421) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.core.v3.QueryExecutorImpl.execute(QueryExecutorImpl.java:372) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgStatement.executeInternal(PgStatement.java:518) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:435) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgPreparedStatement.executeWithFlags(PgPreparedStatement.java:196) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgPreparedStatement.executeQuery(PgPreparedStatement.java:139) ~[postgresql-42.7.7.jar:42.7.7]
        at com.zaxxer.hikari.pool.ProxyPreparedStatement.executeQuery(ProxyPreparedStatement.java:52) ~[HikariCP-5.0.1.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.executeQuery(HikariProxyPreparedStatement.java) ~[HikariCP-5.0.1.jar:na]
        at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.extract(ResultSetReturnImpl.java:57) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        ... 54 common frames omitted

2025-08-22T17:53:46.234+05:30  INFO 162474 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2025-08-22T17:53:46.236+05:30  INFO 162474 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-08-22T17:53:46.256+05:30  INFO 162474 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
chandra@chandra-latitude-ubuntu22:~/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade$  cd /home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade ; /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_3azoqo6wo2rkg3nhmty6qmiqk.argfile payroll.PayrollApplication 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.0)

2025-08-22T17:58:32.008+05:30  INFO 166062 --- [           main] payroll.PayrollApplication               : Starting PayrollApplication using Java 17.0.16 with PID 166062 (/media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade/target/classes started by chandra in /media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade)
2025-08-22T17:58:32.017+05:30  INFO 166062 --- [           main] payroll.PayrollApplication               : No active profile set, falling back to 1 default profile: "default"
2025-08-22T17:58:33.039+05:30  INFO 166062 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-08-22T17:58:33.102+05:30  INFO 166062 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 52 ms. Found 1 JPA repository interfaces.
2025-08-22T17:58:33.840+05:30  INFO 166062 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
2025-08-22T17:58:33.853+05:30  INFO 166062 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-22T17:58:33.853+05:30  INFO 166062 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]
2025-08-22T17:58:33.955+05:30  INFO 166062 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-22T17:58:33.957+05:30  INFO 166062 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1825 ms
2025-08-22T17:58:34.117+05:30  INFO 166062 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-08-22T17:58:34.408+05:30  INFO 166062 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@208205ed
2025-08-22T17:58:34.410+05:30  INFO 166062 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-08-22T17:58:34.471+05:30  INFO 166062 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-08-22T17:58:34.546+05:30  INFO 166062 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.2.Final
2025-08-22T17:58:34.549+05:30  INFO 166062 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2025-08-22T17:58:34.704+05:30  INFO 166062 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T17:58:34.846+05:30  INFO 166062 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-08-22T17:58:34.920+05:30  INFO 166062 --- [           main] org.hibernate.orm.dialect                : HHH035001: Using dialect: org.hibernate.dialect.PostgreSQLDialect, version: org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$DialectResolutionInfoImpl@5e5a8718
2025-08-22T17:58:35.107+05:30  INFO 166062 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T17:58:35.737+05:30  INFO 166062 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2025-08-22T17:58:35.740+05:30  INFO 166062 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-08-22T17:58:36.070+05:30  WARN 166062 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-08-22T17:58:36.582+05:30  INFO 166062 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2025-08-22T17:58:36.597+05:30  INFO 166062 --- [           main] payroll.PayrollApplication               : Started PayrollApplication in 5.26 seconds (process running for 5.596)
2025-08-22T17:58:36.637+05:30  WARN 166062 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 0, SQLState: 42P01
2025-08-22T17:58:36.637+05:30 ERROR 166062 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : ERROR: relation "employee_seq" does not exist
  Position: 16
2025-08-22T17:58:36.662+05:30  INFO 166062 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-08-22T17:58:36.688+05:30 ERROR 166062 --- [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalStateException: Failed to execute CommandLineRunner
        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:773) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:754) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1305) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1294) ~[spring-boot-3.1.0.jar:3.1.0]
        at payroll.PayrollApplication.main(PayrollApplication.java:10) ~[classes/:na]
Caused by: org.springframework.dao.InvalidDataAccessResourceUsageException: could not extract ResultSet [ERROR: relation "employee_seq" does not exist
  Position: 16] [n/a]; SQL [n/a]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:256) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:229) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:550) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:163) ~[spring-data-jpa-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:223) ~[spring-aop-6.0.9.jar:6.0.9]
        at payroll.$Proxy108.save(Unknown Source) ~[na:na]
        at payroll.LoadDatabase.lambda$0(LoadDatabase.java:18) ~[classes/:na]
        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:770) ~[spring-boot-3.1.0.jar:3.1.0]
        ... 5 common frames omitted
Caused by: org.hibernate.exception.SQLGrammarException: could not extract ResultSet [ERROR: relation "employee_seq" does not exist
  Position: 16] [n/a]
        at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:89) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.extract(ResultSetReturnImpl.java:67) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.SequenceStructure$1.getNextValue(SequenceStructure.java:102) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.PooledOptimizer.generate(PooledOptimizer.java:72) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.SequenceStyleGenerator.generate(SequenceStyleGenerator.java:542) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.IdentifierGenerator.generate(IdentifierGenerator.java:147) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.AbstractSaveEventListener.saveWithGeneratedId(AbstractSaveEventListener.java:120) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.entityIsTransient(DefaultPersistEventListener.java:175) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.persist(DefaultPersistEventListener.java:93) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:77) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:54) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:127) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.internal.SessionImpl.firePersist(SessionImpl.java:755) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.internal.SessionImpl.persist(SessionImpl.java:739) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:569) ~[na:na]
        at org.springframework.orm.jpa.SharedEntityManagerCreator$SharedEntityManagerInvocationHandler.invoke(SharedEntityManagerCreator.java:311) ~[spring-orm-6.0.9.jar:6.0.9]
        at jdk.proxy2/jdk.proxy2.$Proxy105.persist(Unknown Source) ~[na:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.save(SimpleJpaRepository.java:637) ~[spring-data-jpa-3.1.0.jar:3.1.0]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:569) ~[na:na]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker$RepositoryFragmentMethodInvoker.lambda$new$0(RepositoryMethodInvoker.java:288) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker.doInvoke(RepositoryMethodInvoker.java:136) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker.invoke(RepositoryMethodInvoker.java:120) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.invoke(RepositoryComposition.java:516) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:285) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.invoke(RepositoryFactorySupport.java:628) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.doInvoke(QueryExecutorMethodInterceptor.java:168) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.invoke(QueryExecutorMethodInterceptor.java:143) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:77) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:123) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:391) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137) ~[spring-tx-6.0.9.jar:6.0.9]
        ... 14 common frames omitted
Caused by: org.postgresql.util.PSQLException: ERROR: relation "employee_seq" does not exist
  Position: 16
        at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2734) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.core.v3.QueryExecutorImpl.processResults(QueryExecutorImpl.java:2421) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.core.v3.QueryExecutorImpl.execute(QueryExecutorImpl.java:372) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgStatement.executeInternal(PgStatement.java:518) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:435) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgPreparedStatement.executeWithFlags(PgPreparedStatement.java:196) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgPreparedStatement.executeQuery(PgPreparedStatement.java:139) ~[postgresql-42.7.7.jar:42.7.7]
        at com.zaxxer.hikari.pool.ProxyPreparedStatement.executeQuery(ProxyPreparedStatement.java:52) ~[HikariCP-5.0.1.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.executeQuery(HikariProxyPreparedStatement.java) ~[HikariCP-5.0.1.jar:na]
        at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.extract(ResultSetReturnImpl.java:57) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        ... 54 common frames omitted

2025-08-22T17:58:36.724+05:30  INFO 166062 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2025-08-22T17:58:36.728+05:30  INFO 166062 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-08-22T17:58:36.761+05:30  INFO 166062 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
chandra@chandra-latitude-ubuntu22:~/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade$  cd /home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade ; /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_3azoqo6wo2rkg3nhmty6qmiqk.argfile payroll.PayrollApplication 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.0)

2025-08-22T17:58:51.524+05:30  INFO 166443 --- [           main] payroll.PayrollApplication               : Starting PayrollApplication using Java 17.0.16 with PID 166443 (/media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade/target/classes started by chandra in /media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade)
2025-08-22T17:58:51.528+05:30  INFO 166443 --- [           main] payroll.PayrollApplication               : No active profile set, falling back to 1 default profile: "default"
2025-08-22T17:58:52.229+05:30  INFO 166443 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-08-22T17:58:52.284+05:30  INFO 166443 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 48 ms. Found 1 JPA repository interfaces.
2025-08-22T17:58:52.876+05:30  INFO 166443 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
2025-08-22T17:58:52.886+05:30  INFO 166443 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-22T17:58:52.886+05:30  INFO 166443 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]
2025-08-22T17:58:52.993+05:30  INFO 166443 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-22T17:58:52.995+05:30  INFO 166443 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1395 ms
2025-08-22T17:58:53.154+05:30  INFO 166443 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-08-22T17:58:53.458+05:30  INFO 166443 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@22bf9122
2025-08-22T17:58:53.460+05:30  INFO 166443 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-08-22T17:58:53.501+05:30  INFO 166443 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-08-22T17:58:53.556+05:30  INFO 166443 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.2.Final
2025-08-22T17:58:53.557+05:30  INFO 166443 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2025-08-22T17:58:53.674+05:30  INFO 166443 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T17:58:53.792+05:30  INFO 166443 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-08-22T17:58:53.861+05:30  INFO 166443 --- [           main] org.hibernate.orm.dialect                : HHH035001: Using dialect: org.hibernate.dialect.PostgreSQLDialect, version: org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$DialectResolutionInfoImpl@4ebd6fd6
2025-08-22T17:58:54.049+05:30  INFO 166443 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T17:58:54.529+05:30  INFO 166443 --- [           main] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2025-08-22T17:58:54.532+05:30  INFO 166443 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2025-08-22T17:58:54.778+05:30  WARN 166443 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2025-08-22T17:58:55.168+05:30  INFO 166443 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 9090 (http) with context path ''
2025-08-22T17:58:55.178+05:30  INFO 166443 --- [           main] payroll.PayrollApplication               : Started PayrollApplication in 4.097 seconds (process running for 4.458)
2025-08-22T17:58:55.223+05:30  WARN 166443 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : SQL Error: 0, SQLState: 42P01
2025-08-22T17:58:55.224+05:30 ERROR 166443 --- [           main] o.h.engine.jdbc.spi.SqlExceptionHelper   : ERROR: relation "employee_seq" does not exist
  Position: 16
2025-08-22T17:58:55.248+05:30  INFO 166443 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-08-22T17:58:55.269+05:30 ERROR 166443 --- [           main] o.s.boot.SpringApplication               : Application run failed

java.lang.IllegalStateException: Failed to execute CommandLineRunner
        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:773) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.callRunners(SpringApplication.java:754) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:318) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1305) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1294) ~[spring-boot-3.1.0.jar:3.1.0]
        at payroll.PayrollApplication.main(PayrollApplication.java:10) ~[classes/:na]
Caused by: org.springframework.dao.InvalidDataAccessResourceUsageException: could not extract ResultSet [ERROR: relation "employee_seq" does not exist
  Position: 16] [n/a]; SQL [n/a]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.convertHibernateAccessException(HibernateJpaDialect.java:256) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.vendor.HibernateJpaDialect.translateExceptionIfPossible(HibernateJpaDialect.java:229) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.translateExceptionIfPossible(AbstractEntityManagerFactoryBean.java:550) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.ChainedPersistenceExceptionTranslator.translateExceptionIfPossible(ChainedPersistenceExceptionTranslator.java:61) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.DataAccessUtils.translateIfNecessary(DataAccessUtils.java:242) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:152) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.jpa.repository.support.CrudMethodMetadataPostProcessor$CrudMethodMetadataPopulatingMethodInterceptor.invoke(CrudMethodMetadataPostProcessor.java:163) ~[spring-data-jpa-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.interceptor.ExposeInvocationInterceptor.invoke(ExposeInvocationInterceptor.java:97) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.JdkDynamicAopProxy.invoke(JdkDynamicAopProxy.java:223) ~[spring-aop-6.0.9.jar:6.0.9]
        at payroll.$Proxy108.save(Unknown Source) ~[na:na]
        at payroll.LoadDatabase.lambda$0(LoadDatabase.java:18) ~[classes/:na]
        at org.springframework.boot.SpringApplication.callRunner(SpringApplication.java:770) ~[spring-boot-3.1.0.jar:3.1.0]
        ... 5 common frames omitted
Caused by: org.hibernate.exception.SQLGrammarException: could not extract ResultSet [ERROR: relation "employee_seq" does not exist
  Position: 16] [n/a]
        at org.hibernate.exception.internal.SQLStateConversionDelegate.convert(SQLStateConversionDelegate.java:89) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.exception.internal.StandardSQLExceptionConverter.convert(StandardSQLExceptionConverter.java:56) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:108) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(SqlExceptionHelper.java:94) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.extract(ResultSetReturnImpl.java:67) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.SequenceStructure$1.getNextValue(SequenceStructure.java:102) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.PooledOptimizer.generate(PooledOptimizer.java:72) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.enhanced.SequenceStyleGenerator.generate(SequenceStyleGenerator.java:542) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.IdentifierGenerator.generate(IdentifierGenerator.java:147) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.AbstractSaveEventListener.saveWithGeneratedId(AbstractSaveEventListener.java:120) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.entityIsTransient(DefaultPersistEventListener.java:175) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.persist(DefaultPersistEventListener.java:93) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:77) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.internal.DefaultPersistEventListener.onPersist(DefaultPersistEventListener.java:54) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.event.service.internal.EventListenerGroupImpl.fireEventOnEachListener(EventListenerGroupImpl.java:127) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.internal.SessionImpl.firePersist(SessionImpl.java:755) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.internal.SessionImpl.persist(SessionImpl.java:739) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:569) ~[na:na]
        at org.springframework.orm.jpa.SharedEntityManagerCreator$SharedEntityManagerInvocationHandler.invoke(SharedEntityManagerCreator.java:311) ~[spring-orm-6.0.9.jar:6.0.9]
        at jdk.proxy2/jdk.proxy2.$Proxy105.persist(Unknown Source) ~[na:na]
        at org.springframework.data.jpa.repository.support.SimpleJpaRepository.save(SimpleJpaRepository.java:637) ~[spring-data-jpa-3.1.0.jar:3.1.0]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
        at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
        at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
        at java.base/java.lang.reflect.Method.invoke(Method.java:569) ~[na:na]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker$RepositoryFragmentMethodInvoker.lambda$new$0(RepositoryMethodInvoker.java:288) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker.doInvoke(RepositoryMethodInvoker.java:136) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryMethodInvoker.invoke(RepositoryMethodInvoker.java:120) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryComposition$RepositoryFragments.invoke(RepositoryComposition.java:516) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryComposition.invoke(RepositoryComposition.java:285) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.RepositoryFactorySupport$ImplementationMethodExecutionInterceptor.invoke(RepositoryFactorySupport.java:628) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.doInvoke(QueryExecutorMethodInterceptor.java:168) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.data.repository.core.support.QueryExecutorMethodInterceptor.invoke(QueryExecutorMethodInterceptor.java:143) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.data.projection.DefaultMethodInvokingMethodInterceptor.invoke(DefaultMethodInvokingMethodInterceptor.java:77) ~[spring-data-commons-3.1.0.jar:3.1.0]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionInterceptor$1.proceedWithInvocation(TransactionInterceptor.java:123) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionAspectSupport.invokeWithinTransaction(TransactionAspectSupport.java:391) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.transaction.interceptor.TransactionInterceptor.invoke(TransactionInterceptor.java:119) ~[spring-tx-6.0.9.jar:6.0.9]
        at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:184) ~[spring-aop-6.0.9.jar:6.0.9]
        at org.springframework.dao.support.PersistenceExceptionTranslationInterceptor.invoke(PersistenceExceptionTranslationInterceptor.java:137) ~[spring-tx-6.0.9.jar:6.0.9]
        ... 14 common frames omitted
Caused by: org.postgresql.util.PSQLException: ERROR: relation "employee_seq" does not exist
  Position: 16
        at org.postgresql.core.v3.QueryExecutorImpl.receiveErrorResponse(QueryExecutorImpl.java:2734) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.core.v3.QueryExecutorImpl.processResults(QueryExecutorImpl.java:2421) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.core.v3.QueryExecutorImpl.execute(QueryExecutorImpl.java:372) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgStatement.executeInternal(PgStatement.java:518) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgStatement.execute(PgStatement.java:435) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgPreparedStatement.executeWithFlags(PgPreparedStatement.java:196) ~[postgresql-42.7.7.jar:42.7.7]
        at org.postgresql.jdbc.PgPreparedStatement.executeQuery(PgPreparedStatement.java:139) ~[postgresql-42.7.7.jar:42.7.7]
        at com.zaxxer.hikari.pool.ProxyPreparedStatement.executeQuery(ProxyPreparedStatement.java:52) ~[HikariCP-5.0.1.jar:na]
        at com.zaxxer.hikari.pool.HikariProxyPreparedStatement.executeQuery(HikariProxyPreparedStatement.java) ~[HikariCP-5.0.1.jar:na]
        at org.hibernate.engine.jdbc.internal.ResultSetReturnImpl.extract(ResultSetReturnImpl.java:57) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        ... 54 common frames omitted

2025-08-22T17:58:55.296+05:30  INFO 166443 --- [           main] j.LocalContainerEntityManagerFactoryBean : Closing JPA EntityManagerFactory for persistence unit 'default'
2025-08-22T17:58:55.299+05:30  INFO 166443 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-08-22T17:58:55.321+05:30  INFO 166443 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
chandra@chandra-latitude-ubuntu22:~/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade$ ^C
chandra@chandra-latitude-ubuntu22:~/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade$  cd /home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade ; /usr/bin/env /usr/lib/jvm/java-17-openjdk-amd64/bin/java @/tmp/cp_3azoqo6wo2rkg3nhmty6qmiqk.argfile payroll.PayrollApplication 

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v3.1.0)

2025-08-22T18:03:48.181+05:30  INFO 170201 --- [           main] payroll.PayrollApplication               : Starting PayrollApplication using Java 17.0.16 with PID 170201 (/media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade/target/classes started by chandra in /media/chandra/b664505e-129c-4c0d-a87b-9efb6469eca2/home/chandra/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade)
2025-08-22T18:03:48.184+05:30  INFO 170201 --- [           main] payroll.PayrollApplication               : No active profile set, falling back to 1 default profile: "default"
2025-08-22T18:03:48.996+05:30  INFO 170201 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2025-08-22T18:03:49.081+05:30  INFO 170201 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 73 ms. Found 1 JPA repository interfaces.
2025-08-22T18:03:49.705+05:30  INFO 170201 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 9090 (http)
2025-08-22T18:03:49.723+05:30  INFO 170201 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2025-08-22T18:03:49.723+05:30  INFO 170201 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/10.1.8]
2025-08-22T18:03:49.868+05:30  INFO 170201 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2025-08-22T18:03:49.871+05:30  INFO 170201 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 1619 ms
2025-08-22T18:03:50.071+05:30  INFO 170201 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2025-08-22T18:03:50.380+05:30  INFO 170201 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection org.postgresql.jdbc.PgConnection@36068727
2025-08-22T18:03:50.382+05:30  INFO 170201 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2025-08-22T18:03:50.436+05:30  INFO 170201 --- [           main] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2025-08-22T18:03:50.510+05:30  INFO 170201 --- [           main] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 6.2.2.Final
2025-08-22T18:03:50.513+05:30  INFO 170201 --- [           main] org.hibernate.cfg.Environment            : HHH000406: Using bytecode reflection optimizer
2025-08-22T18:03:50.650+05:30  INFO 170201 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T18:03:50.775+05:30  INFO 170201 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2025-08-22T18:03:50.848+05:30  INFO 170201 --- [           main] org.hibernate.orm.dialect                : HHH035001: Using dialect: org.hibernate.dialect.PostgreSQLDialect, version: org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$DialectResolutionInfoImpl@f03ee8f
2025-08-22T18:03:51.041+05:30  INFO 170201 --- [           main] o.h.b.i.BytecodeProviderInitiator        : HHH000021: Bytecode provider name : bytebuddy
2025-08-22T18:03:51.115+05:30 ERROR 170201 --- [           main] j.LocalContainerEntityManagerFactoryBean : Failed to initialize JPA EntityManagerFactory: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.MappingException: Could not instantiate id generator [entity-name=payroll.Employee]
2025-08-22T18:03:51.116+05:30  WARN 170201 --- [           main] ConfigServletWebServerApplicationContext : Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.MappingException: Could not instantiate id generator [entity-name=payroll.Employee]
2025-08-22T18:03:51.116+05:30  INFO 170201 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown initiated...
2025-08-22T18:03:51.132+05:30  INFO 170201 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Shutdown completed.
2025-08-22T18:03:51.136+05:30  INFO 170201 --- [           main] o.apache.catalina.core.StandardService   : Stopping service [Tomcat]
2025-08-22T18:03:51.160+05:30  INFO 170201 --- [           main] .s.b.a.l.ConditionEvaluationReportLogger : 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
2025-08-22T18:03:51.187+05:30 ERROR 170201 --- [           main] o.s.boot.SpringApplication               : Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.MappingException: Could not instantiate id generator [entity-name=payroll.Employee]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1770) ~[spring-beans-6.0.9.jar:6.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:598) ~[spring-beans-6.0.9.jar:6.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:520) ~[spring-beans-6.0.9.jar:6.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.0.9.jar:6.0.9]
        at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.0.9.jar:6.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.0.9.jar:6.0.9]
        at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.0.9.jar:6.0.9]
        at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1156) ~[spring-context-6.0.9.jar:6.0.9]
        at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:931) ~[spring-context-6.0.9.jar:6.0.9]
        at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:608) ~[spring-context-6.0.9.jar:6.0.9]
        at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:733) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:435) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:311) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1305) ~[spring-boot-3.1.0.jar:3.1.0]
        at org.springframework.boot.SpringApplication.run(SpringApplication.java:1294) ~[spring-boot-3.1.0.jar:3.1.0]
        at payroll.PayrollApplication.main(PayrollApplication.java:10) ~[classes/:na]
Caused by: jakarta.persistence.PersistenceException: [PersistenceUnit: default] Unable to build Hibernate SessionFactory; nested exception is org.hibernate.MappingException: Could not instantiate id generator [entity-name=payroll.Employee]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:421) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:352) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1816) ~[spring-beans-6.0.9.jar:6.0.9]
        at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1766) ~[spring-beans-6.0.9.jar:6.0.9]
        ... 16 common frames omitted
Caused by: org.hibernate.MappingException: Could not instantiate id generator [entity-name=payroll.Employee]
        at org.hibernate.id.factory.internal.StandardIdentifierGeneratorFactory.createIdentifierGenerator(StandardIdentifierGeneratorFactory.java:230) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.factory.internal.IdentifierGeneratorUtil.createLegacyIdentifierGenerator(IdentifierGeneratorUtil.java:126) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.mapping.SimpleValue.createGenerator(SimpleValue.java:414) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.internal.SessionFactoryImpl.lambda$createGenerators$1(SessionFactoryImpl.java:412) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183) ~[na:na]
        at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
        at java.base/java.util.HashMap$ValueSpliterator.forEachRemaining(HashMap.java:1779) ~[na:na]
        at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
        at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
        at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150) ~[na:na]
        at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173) ~[na:na]
        at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234) ~[na:na]
        at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:596) ~[na:na]
        at org.hibernate.internal.SessionFactoryImpl.createGenerators(SessionFactoryImpl.java:411) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.internal.SessionFactoryImpl.<init>(SessionFactoryImpl.java:248) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.boot.internal.SessionFactoryBuilderImpl.build(SessionFactoryBuilderImpl.java:431) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1455) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:66) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:376) ~[spring-orm-6.0.9.jar:6.0.9]
        at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.0.9.jar:6.0.9]
        ... 20 common frames omitted
Caused by: org.hibernate.MappingException: The increment size of the [employee_SEQ] sequence is set to [50] in the entity mapping while the associated database sequence increment size is [1].
        at org.hibernate.id.enhanced.SequenceStyleGenerator.configure(SequenceStyleGenerator.java:224) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        at org.hibernate.id.factory.internal.StandardIdentifierGeneratorFactory.createIdentifierGenerator(StandardIdentifierGeneratorFactory.java:224) ~[hibernate-core-6.2.2.Final.jar:6.2.2.Final]
        ... 39 common frames omitted

chandra@chandra-latitude-ubuntu22:~/code/fhir-facade-java-spring-boot-hapi-fhir/fhirfacade$