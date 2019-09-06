package com.zdjc.springcloud.configbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;

/**
 * @ClassName:     ConfigBean.java
 * @Description:   TODO 
 * 
 * @author          zf
 * @version         V1.0  
 * @Date           2019年9月6日 上午9:12:18 
 */
@Configuration
public class ConfigBean {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
	
	@Bean
	public IRule myRule(){
		return new RoundRobinRule(); 	//轮询策略
	}

}
