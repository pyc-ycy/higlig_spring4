//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:Main.java
// @User:彭友聪
//@Date:2019/10/12
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch2.prepost;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);
        context.close();
    }

}
