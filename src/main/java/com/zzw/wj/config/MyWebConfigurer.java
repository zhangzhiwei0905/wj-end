package com.zzw.wj.config;

import com.zzw.wj.interceptor.LoginInterceptor;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 功能描述
 *
 * @author z00770293
 * @since 2023年04月02日
 */
@SpringBootConfiguration
public class MyWebConfigurer implements WebMvcConfigurer {
    @Bean
    public LoginInterceptor getLoginIntercepter() {
        return new LoginInterceptor();
    }

    // @Override
    // public void addCorsMappings(CorsRegistry registry) {
    //     registry.addMapping("/**").allowedOrigins("http://127.0.0.1");
    // }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(getLoginIntercepter()).addPathPatterns("/**").excludePathPatterns("/index.html");
    }
}
