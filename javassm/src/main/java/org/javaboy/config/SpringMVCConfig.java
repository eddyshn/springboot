package org.javaboy.config;

import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import org.javaboy.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;

@Configuration
@ComponentScan(basePackages = "org.javaboy",useDefaultFilters = false,
        includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Configuration.class)})
public class SpringMVCConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**");
    }

    @Bean
    MyInterceptor myInterceptor() {
        return new MyInterceptor();
    }

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        FastJsonHttpMessageConverter converter = new FastJsonHttpMessageConverter();
        converters.add(converter);
    }
}
