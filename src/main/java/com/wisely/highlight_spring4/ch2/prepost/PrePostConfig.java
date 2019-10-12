//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:PrePostConfig.java
// @User:彭友聪
//@Date:2019/10/12
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch2.prepost;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch2.prepost")
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destory")
    BeanWayService beanWayService(){
        return new BeanWayService();
    }
    @Bean
    JSR250WayService jsr250WayService(){
        return new JSR250WayService();
    }
}
