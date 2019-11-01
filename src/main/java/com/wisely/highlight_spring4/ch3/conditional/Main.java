//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:Main.java
// @User:彭友聪
//@Date:2019/11/01
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.conditional;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println(context.getEnvironment().getProperty("os.name") + "系统下的列表命令为："
                            + listService.showListCmd());
        System.out.println(context.getEnvironment().getProperty("","Linux") + "系统下列表的命令为：" + listService.showListCmd());
    }
}
