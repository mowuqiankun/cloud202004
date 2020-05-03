这是一个springboot较为完整的demo，含有以下內容。

1.在Git项目中定义 .gitignore 文件
   这种方式通过在项目的某个文件夹下定义 .gitignore 文件，在该文件中定义相应的忽略规则，来管理当前文件夹下的文件的Git提交行为。
   .gitignore 文件是可以提交到共有仓库中，这就为该项目下的所有开发者都共享一套定义好的忽略规则。

2、热部署；

3、swagger (访问：localhost:8080/swagger-ui.html)

4、整合Mybatis-plus（mybatis增强）
  1)yml配置
  2）congfig类扫描dao
  
5、idea Easy Code代码自动生成(mybatis plus+swagger)
  1) 修改Type Mapper
  2）修改作者名称
  3）修改其他模版，引入swagger等配置
  
    
6、集成log4j2(+slf4j)
   log4j2参考了logback的一些优秀的设计，并且修复了一些问题，因此带来了一些重大的提升，主要有：
   1) 异常处理：在logback中，Appender中的异常不会被应用感知到，但是在log4j2中，提供了一些异常处理机制。
   2）性能提升：log4j2相较于log4j 1和logback都具有很明显的性能提升。
   3）自动重载配置：参考了logback的设计，提供自动刷新参数配置，可以动态的修改日志的级别而不需要重启应用。
   4）无垃圾机制，log4j2在大部分情况下，都可以使用其设计的一套无垃圾机制，避免频繁的日志收集导致的jvm gc。

7、集成Druid数据源：（访问：localhost:8080/druid/index.html）
   application.yml 添加配置，不需要配置类
   
8、springboot校验(@RestControllerAdvice 全局异常拦截器,分组，及自定义）
   
9、引入shiro+JWT（json web token)


