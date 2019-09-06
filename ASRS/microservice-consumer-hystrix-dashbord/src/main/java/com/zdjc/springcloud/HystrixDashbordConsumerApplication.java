package com.zdjc.springcloud;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages="com.zdjc.springcloud.service")
@EnableHystrixDashboard
public class HystrixDashbordConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashbordConsumerApplication.class, args);
	}

}
