//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:WiselyConfiguration.java
// @User:彭友聪
//@Date:2019/11/03
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan
public @interface WiselyConfiguration {
    String[] value() default {};
}
