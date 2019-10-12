//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:JSR250WayService.java
// @User:彭友聪
//@Date:2019/10/12
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch2.prepost;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("jsr250-init-method");
    }
    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }
    @PreDestroy
    public void destory(){
        System.out.println("jsr250-destory-method");
    }
}
