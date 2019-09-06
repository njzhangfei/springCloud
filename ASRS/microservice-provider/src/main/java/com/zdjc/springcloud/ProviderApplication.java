package com.zdjc.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName:     ProviderApplication.java
 * @Description:   TODO 
 * 
 * @author          zf
 * @version         V1.0  
 * @Date           2019年9月6日 上午11:35:55 
 */
@SpringBootApplication
@EnableEurekaClient  //本服务启动后会自动注册进eureka服务中
public class ProviderApplication {
	public static void main(String[] args) {

		SpringApplication.run(ProviderApplication.class, args);
	}
}
