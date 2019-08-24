package com.example.eddy.config;

import com.example.eddy.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @program: eddy
 * @description:
 * @author: Eddy.Shan
 * @create: 2019-08-24 17:43
 **/
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Bean
    MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor()).addPathPatterns("/**");
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("http://localhost:8080")
                .allowedHeaders("/*")
                .allowedMethods("/*")
                .maxAge(30*1000);
    }
}
