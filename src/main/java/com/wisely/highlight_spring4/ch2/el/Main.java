//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:Main.java
// @User:彭友聪
//@Date:2019/09/29
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch2.el;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);
        resourceService.outputResource();
        context.close();
    }
}
