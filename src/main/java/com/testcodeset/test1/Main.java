//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:Main.java
// @User:彭友聪
//@Date:2019/10/13
// Author:御承扬
//E-mail:2923616405@qq.com


package com.testcodeset.test1;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入a");
        int a = sc.nextInt();
        System.out.println("请输入b");
        int b = sc.nextInt();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.countAB(a, b));
        context.close();
    }
}
