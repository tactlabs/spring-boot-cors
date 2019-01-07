package org.tact.base;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	
	
    @Override
    public void addCorsMappings(CorsRegistry registry) {
    	
    	registry.addMapping("/*/**").allowedOrigins("http://localhost", "http://70.55.22.158");
    	
    }
    
    /*
     * 
     * https://spring.io/guides/gs/rest-service-cors/
     */
    
}