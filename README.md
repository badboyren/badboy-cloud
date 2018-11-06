# 前言

初学Spring cloud 时曾在网上搜索Spring Cloud的实战项目源码,无奈代码都是零零散散，感觉就没有一个可以完全跑起来的版本，学习成本有点高。

我在自己空闲的时间，利用自己的项目经验，完善了一个比较健全的项目

后期会不断丰富完善项目结构文档内容

本系统架构满足项目线上并发5000的实际情况


__注：此项目纯属个人经验所举，如有疑问，可联系我 badboyren@163.com__


## 技术栈

Spring cloud 2.0.5.RELEASE  Finchley.RELEASE

Spring cloud Eureka Server

Spring cloud config server

Spring cloud zipkin server     

Spring cloud turbine

spring cloud hystrix

spring cloud hystrix-dashboard

spring cloud openfeign

spring cloud bus-amqp

spring cloud zuul

## 项目环境
>  开发环境：eclipse STS , maven , JDK1.8 

#### 运行：

```
	localhost:1111     eureka-server   注册中心
	localhost:8888     zipkin-server   请求链 sleuth     支持 mysql 存储
	localhost:1112     config-server   配置中间  支持 git 文件配置
	localhost:1113     turbine         turbine 监控
	
	localhost:2222     server-user    业务服务 支持 openfeign  hystrix-dashboard   bus-amqp>RabbitMQ
	localhost:3333     server-order   业务服务 支持 openfeign  hystrix-dashboard
	localhost:4444     server-shop    业务服务 支持 hystrix-dashboard
	
	localhost:5555     zuul      网关
```


# 说明

>  如果对您有帮助，您可以点右上角 "Star" 支持一下 谢谢！ ^_^

>  或者您可以 "follow" 一下，我会不断开源更多的有趣的项目


# 待完善部分

1、JWT token 认证

2、ES 项目搜索


# 最终目标

1、利用spring cloud 模块，完成高并发，分布式系统服务

2、直接用项目可以支持10000+的并发处理


。。。敬请期待




# License

[GPL](https://github.com/bailicangdu/vue2-elm/blob/master/COPYING)
