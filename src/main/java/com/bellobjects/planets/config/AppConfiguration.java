package com.bellobjects.planets.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@ComponentScan(basePackages = "com.bellobjects.planets")
public class AppConfiguration {
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
