//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:DemoService.java
// @User:彭友聪
//@Date:2019/09/29
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch2.el;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
@Service
public class DemoService {
    @Value("其他类的属性")
    private String another;

    public String getAnother(){
        return another;
    }
    public void setAnother(String another){
        this.another = another;
    }
}
