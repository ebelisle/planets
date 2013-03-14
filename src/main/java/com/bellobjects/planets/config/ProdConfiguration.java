package com.bellobjects.planets.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Import({ AppConfiguration.class })
@PropertySource("classpath:/com/bellobjects/planets/test.properties")
public class ProdConfiguration {

}
