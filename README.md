# 考勤管理系统

##### 项目整体设计

springboot + restful + data jbdc + mysql



##### 软件架构

前端+后端：

前端采用了一个网站模板，可以通过本地url进入前端页面  

使用restful api来实现与前端的交互

设计了Controller层、Repository层、Config层之间的接口

设计了与数据库相接的DAO

数据库设计表项共5条，1个表



##### 开发环境要求

* java 8 
* Maven
* Mysql
* springboot 2.3.0+



##### 启动程序的两个方法

1.maven 打包（pring-boot-maven-plugin提供了超简便的打包方法）

~~~
maven clean;     # maven 清理
maven package    # 打包
# 启动程序
java -jar target/snails-0.1.jar
~~~

2.在IDEA中直接运行（示例视频采用的是这种方法，其它IDE应该都可）

~~~
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.3.0.RELEASE)

2020-06-09 11:10:30.689  INFO 12724 --- [           main] com.example.spring.Application           : Starting Application on LAPTOP-O4IHFJBI with PID 12724 (D:\springboot\target\classes started by Westlife in D:\springboot)
2020-06-09 11:10:30.692  INFO 12724 --- [           main] com.example.spring.Application           : No active profile set, falling back to default profiles: default
2020-06-09 11:10:31.222  INFO 12724 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFERRED mode.
2020-06-09 11:10:31.260  INFO 12724 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 32ms. Found 1 JPA repository interfaces.
2020-06-09 11:10:31.583  INFO 12724 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 5799 (http)
2020-06-09 11:10:31.589  INFO 12724 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2020-06-09 11:10:31.590  INFO 12724 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.35]
2020-06-09 11:10:31.679  INFO 12724 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2020-06-09 11:10:31.679  INFO 12724 --- [           main] o.s.web.context.ContextLoader            : Root WebApplicationContext: initialization completed in 947 ms
2020-06-09 11:10:31.794  INFO 12724 --- [           main] o.s.s.concurrent.ThreadPoolTaskExecutor  : Initializing ExecutorService 'applicationTaskExecutor'
2020-06-09 11:10:31.812  INFO 12724 --- [           main] f.a.AutowiredAnnotationBeanPostProcessor : Autowired annotation is not supported on static methods: public static void com.example.spring.Application.main(java.lang.String[])
2020-06-09 11:10:31.820  INFO 12724 --- [         task-1] o.hibernate.jpa.internal.util.LogHelper  : HHH000204: Processing PersistenceUnitInfo [name: default]
2020-06-09 11:10:31.839  WARN 12724 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2020-06-09 11:10:31.854  INFO 12724 --- [         task-1] org.hibernate.Version                    : HHH000412: Hibernate ORM core version 5.4.15.Final
2020-06-09 11:10:31.949  INFO 12724 --- [         task-1] o.hibernate.annotations.common.Version   : HCANN000001: Hibernate Commons Annotations {5.1.0.Final}
2020-06-09 11:10:32.016  INFO 12724 --- [         task-1] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2020-06-09 11:10:32.812  INFO 12724 --- [         task-1] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2020-06-09 11:10:32.826  INFO 12724 --- [         task-1] org.hibernate.dialect.Dialect            : HHH000400: Using dialect: org.hibernate.dialect.MySQL8Dialect
2020-06-09 11:10:33.243  INFO 12724 --- [         task-1] o.h.e.t.j.p.i.JtaPlatformInitiator       : HHH000490: Using JtaPlatform implementation: [org.hibernate.engine.transaction.jta.platform.internal.NoJtaPlatform]
2020-06-09 11:10:33.248  INFO 12724 --- [         task-1] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2020-06-09 11:10:33.424  INFO 12724 --- [           main] o.s.b.a.w.s.WelcomePageHandlerMapping    : Adding welcome page template: index
2020-06-09 11:10:33.541  INFO 12724 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 5799 (http) with context path ''
2020-06-09 11:10:33.541  INFO 12724 --- [           main] DeferredRepositoryInitializationListener : Triggering deferred initialization of Spring Data repositories…
2020-06-09 11:10:33.623  INFO 12724 --- [           main] DeferredRepositoryInitializationListener : Spring Data repositories initialized!
2020-06-09 11:10:33.628  INFO 12724 --- [           main] com.example.spring.Application           : Started Application in 3.282 seconds (JVM running for 4.441)
~~~

##### 测试方法

1.在项目目录下运行springboot

2.通过本地url来测试前端页面的展示

3.使用Postman来执行GET、POST、PUT、DELETE等操作。







