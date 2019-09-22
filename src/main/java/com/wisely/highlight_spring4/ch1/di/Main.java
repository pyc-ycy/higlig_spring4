package com.wisely.highlight_spring4.ch1.di;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);  // 1
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);  //2
        System.out.println(useFunctionService.SayHello("御承扬"));
        context.close();
    }
}
