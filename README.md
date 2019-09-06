# springCloud
微服务简单示例

本次案例用的工具版本如下
eclipse : Mars
JDK : 1.8
SpringCloud : Dalston
SpringBoot : 1.5.9

微服务分类
1、microservice-common
公共微服务
2、microservice-provider
服务提供者微服务
3、microservice-consumer
消费者微服务
4、microservice-eurake1
此微服务用于注册和发现服务
5、microservice-eurake1、microservice-eurake2、microservice-eurake3
eureka微服务集群，只能有一个正在工作
6、microservice-provider、microservice-provider2、microservice-provider3
Ribbon负载均衡
7、microservice-consumer-feign
feign负载均衡
8、microservice-provider-hystrix
Hystrix断路器，熔断服务
9、microservice-consumer-feign-hystrix
熔断降级服务
http://localhost:7003/consumer/get/1
10、microservice-consumer-hystrix-dashbord
监控服务
http://localhost:7002/hystrix
http://localhost:8005/hystrix.stream
11、microservice-zull
路由服务
http://localhost:6001/wms/provider//getUser/list
12、microservice-config-server
配置服务


后续慢慢添加。。。。。。
