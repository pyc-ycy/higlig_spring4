//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:DemoService.java
// @User:彭友聪
//@Date:2019/11/03
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.annotation;
import org.springframework.stereotype.Service;
@Service
public class DemoService {
    public void outputResult(){
        System.out.println("从组合注解配置照样获得bean");
    }
}
