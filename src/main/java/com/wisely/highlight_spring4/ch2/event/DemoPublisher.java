//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:DemoPublisher.java
// @User:彭友聪
//@Date:2019/10/26
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch2.event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
@Component
public class DemoPublisher {
    @Autowired
    ApplicationContext applicationContext;
    public void publisher(String msg){
        applicationContext.publishEvent(new DemoEvent(this, msg));
    }
}
