package com.intern.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	
//	@Override
//	public void addResourceHandlers(ResourceHandlerRegistry registry)
//	{
//		registry
//			.addResourceHandler("/resources/**")
//			.addResourceLocations("/resources/")
//			.setCachePeriod(3600)
//			.resourceChain(true)
//			.addResolver(new PathResourceResolver());
//	}

//	@Bean
//	public CommonsMultipartResolver multipartResolver() {
//		CommonsMultipartResolver mr=new CommonsMultipartResolver();
//		mr.setMaxUploadSize(10000000000L);
//		return mr;
//	}
//	
}
