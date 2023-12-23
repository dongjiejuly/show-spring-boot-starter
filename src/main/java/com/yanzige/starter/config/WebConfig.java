package com.yanzige.starter.config;

import com.yanzige.starter.interceptor.ShowInfoInterceptor;
import com.yanzige.starter.prop.ShowProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 配置类
 * 需要配置拦截器，所以需要实现 WebMvcConfigurer 接口，并实现 addInterceptors 方法
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * 生成ShowProperties配置类并交由Spring容器管理
     *
     * @return ShowProperties配置类bean对象
     */
    @Bean
    public ShowProperties showProperties() {
        return new ShowProperties();
    }

    /**
     * 生成ShowInfoInterceptor类并交由Spring容器管理
     *
     * @return ShowInfoInterceptor拦截器bean对象
     */
    @Bean
    public ShowInfoInterceptor showInfoInterceptor() {
        return new ShowInfoInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截所有请求
        registry.addInterceptor(showInfoInterceptor()).addPathPatterns("/**");
    }
}
