package com.bellobjects.planets.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@PropertySource("classpath:/com/bellobjects/planets/app.properties")
@ComponentScan(basePackages = "com.bellobjects.planets")
//  @Import({ PifRestTemplateConfiguration.class, RumbaConfiguration.class })
@EnableScheduling
public class MainConfiguration {
    @Bean
    public PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    
    // public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
    // return new MappingJackson2HttpMessageConverter();
    // }

    // public JaxbAnnotationIntrospector jaxbAnnotationIntrospector() {
    // return new JaxbAnnotationIntrospector();
    // }
    //
    // public ObjectMapper jacksonObjectMapper() {
    // ObjectMapper objectMapper = new ObjectMapper();
    // objectMapper.setAnnotationIntrospector(jaxbAnnotationIntrospector());
    // return objectMapper;
    // }

}
