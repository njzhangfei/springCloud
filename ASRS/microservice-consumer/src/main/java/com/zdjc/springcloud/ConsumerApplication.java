package com.zdjc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:     ConsumerApplication.java
 * @Description:   TODO 
 * 
 * @author          zf
 * @version         V1.0  
 * @Date           2019年9月6日 上午9:36:17 
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}
}
