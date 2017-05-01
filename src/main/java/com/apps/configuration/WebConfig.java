
package com.apps.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/api/image/**")
				//.addResourceLocations("file:////home/machine/Pictures/temp/")
                                //  .addResourceLocations("file:///D:/temp/")
                                .addResourceLocations("file:temp/")
				.setCachePeriod(0);
	}

}
