package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * @author haya
 */

@Configuration
@EnableWebMvc
@ComponentScan("com")
public class WebMvcConfig extends WebMvcConfigurationSupport {
    //定义试图解析器
    @Bean
    public ViewResolver viewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix( "/WEB-INF/jsp/" );
        resolver.setSuffix( ".jsp" );
//        resolver.setExposeContextBeansAsAttributes( true );
//        resolver.setViewClass( JstlView.class );
        return resolver;
    }

    // 静态资源交给默认的servlet
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }

}
