# Weaver-Eureka-Demo

## 引言

- 本项目只是一个简单demo
- Spring Cloud Feign + Eureka 
- 目前只包含消费者，后续继续完善

## 启动

可直接启动，前提是已经有一个运行中的eureka服务

## 配置

```
spring:
  application:
    name: DemoClient

server:
  port: 85

eureka:
#  password: password
  client:
    serviceUrl:
      # 这里配置eureka地址
      defaultZone: http://localhost:8761/eureka/
  instance:
    leaseRenewalIntervalInSeconds: 10
    metadataMap:
      instanceId: ${vcap.application.instance_id:${spring.application.name}:${spring.application.instance_id:${server.port}}}

weaver:
  provider:
    # 这里配置生产者服务名称
    name: ecology-workflow-service

feign:
  circuitbreaker:
    enabled: true

endpoints:
  restart:
    enabled: true
```



