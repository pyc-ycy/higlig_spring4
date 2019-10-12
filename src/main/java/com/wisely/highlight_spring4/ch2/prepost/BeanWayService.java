//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:BeanWayService.java
// @User:彭友聪
//@Date:2019/10/12
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch2.prepost;

public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }
    public BeanWayService(){
        super();
        System.out.println("初始构造函数-BeanWayService");
    }
    public void destory(){
        System.out.println("@Bean-destory-method");
    }
}
