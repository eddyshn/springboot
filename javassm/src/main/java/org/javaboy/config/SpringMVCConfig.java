package org.javaboy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = "org.javaboy",useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class)})
public class SpringMVCConfig {
}
