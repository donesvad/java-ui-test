package com.donesvad.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.test.context.ContextConfiguration;

import com.donesvad.util.YamlPropertySourceFactory;

@Configuration
@ComponentScan(basePackages = { "com.donesvad" })
@PropertySource(
    value = {
        "classpath:application-${environment:dev}.yml",
        "classpath:test-data-${environment:dev}.yml"
    },
    factory = YamlPropertySourceFactory.class)
@ContextConfiguration
public class SpringConfiguration {

}
