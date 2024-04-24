package com.pandaer.project.config;

import jakarta.annotation.Resource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableConfigurationProperties(WebConfigProperties.class)
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Resource
    private WebConfigProperties properties;

    //设置跨域请求
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping(properties.getCorsMapping())
                .allowCredentials(properties.isAllowedCredentials())
                .allowedHeaders(properties.getAllowedHeaders())
                .allowedMethods(properties.getAllowedMethods())
                .allowedOriginPatterns(properties.getAllowedOriginPatterns());
    }
}
