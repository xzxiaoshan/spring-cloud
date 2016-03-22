package org.sample.cloud.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // 使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。如本类的 app.message
public class TestController {

	@Value("${app.message}")
	private String message;
	
	@Value("${user.username}")
	private String username;
	
	@Value("${user.userage}")
	private String userage;
	
	@RequestMapping("/test")
	public String test(){
		return message + " >> " + username + " >> " + userage;
	}
}
