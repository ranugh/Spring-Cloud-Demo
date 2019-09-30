package com.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigClientApplication.class, args);
	}

}
@RefreshScope(proxyMode = ScopedProxyMode.DEFAULT)
@RestController
class MessageRestController {

	
	 @Value("${msg:Hello world - Config Server is not working..pelase check}")
	    private String msg;
	 
	    @RequestMapping("/msg")
	    String getMsg() {
	        return this.msg;
	    }
}