package com.st.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsoleRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
	
		RestTemplate template=new RestTemplate();
		ResponseEntity<String> entity=template.getForEntity("http://localhost:3030/producer/com/data"
				,String.class);
		System.out.println(entity.getBody());
		System.out.println(entity.getStatusCodeValue());
		System.out.println(entity.getStatusCode());
		System.exit(0);
	}
}
