# ZAN 项目介绍

存放 ZAN 音乐平台代码

# 使用到的三方库

## 1.Mybatis

MyBatis 是一款优秀的持久层框架，它支持自定义 SQL、存储过程以及高级映射。MyBatis 免除了几乎所有的 JDBC 代码以及设置参数和获取结果集的工作。
MyBatis 可以通过简单的 XML 或注解来配置和映射原始类型、接口和 Java POJO（Plain Old Java Objects，普通老式 Java 对象）为数据库中的记录。

### Mybatis 使用方式

- 通过 `Generator` 生成 `MyBatis Dynamic SQL` 风格的代码用于单表的 CRUD，并且不再修改生成的代码；当数据库结构发生变化后，重新生成代码即可
- 也可以通过 `MyBatis Dynamic SQL` API 完成简单的多表查询
- 如果查询语句很复杂，那么使用 `MyBatis 3` 通过编写 SQL 进行查询
- 利用 `PageHelper` 进行分页查询，不需要手动编写包含 `limit` 和 `offset` 的 select 语句

### Mybatis 参考资料

- [Mybatis 3](https://mybatis.org/mybatis-3/)
- [MyBatis Dynamic SQL](https://mybatis.org/mybatis-dynamic-sql/docs/introduction.html)
- [MyBatis Generator](https://mybatis.org/generator/)
- [mybatis-spring-boot-starter](https://mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/zh/index.html)
- [PageHelper](https://pagehelper.github.io/)

# 使用到的三方工具

## 1.flyway

Flyway是独立于数据库的应用、管理并跟踪数据库变更的使用Java编写的数据库版本管理工具。用通俗的话讲，Flyway可以像Git管理不同人的代码那样，
管理不同人的sql脚本，从而做到数据库同步。

Flyway 具有如下特点：
- 使用简单（Simple to use）
- 过 Flyway 能够轻松的实现控制迁移。
- 解决好一个问题（Solves one problem well）
- Flyway 迁移数据库，开发人员就不会迁移出错了
- 专为 CI/CD 设计（Made for CI/CD)
- 发布从未如此简单。`Release have never been this easy`

### flyway 参考资料

- [flyway 官网](https://flywaydb.org/)
- [flyway CLI 文档](https://documentation.red-gate.com/fd/flyway-cli-and-api-183306238.html)

## 2.spotless

Spotless 是一个通用格式插件 ，可用于在 Java 项目中强制执行代码样式和格式规则。 它对于在整个团队中强制执行一致的风格以及确保您的代码满足某些质量标准特别有用。 
Spotless是一个强大的工具，可以帮助确保你的代码具有一致性、可读性和高质量。

### spotless 使用方式

- 方法一：当通过 maven 进行编译(`mvn compile`)时，会自动格式化代码
- 方法二：手动执行 `mvn spotless:apply`

### spotless 参考资料

- [spotless GitHub repository](https://github.com/diffplug/spotless)
