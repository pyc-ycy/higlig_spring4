//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:DemoEvent.java
// @User:彭友聪
//@Date:2019/10/26
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch2.event;
import org.springframework.context.ApplicationEvent;

public class DemoEvent extends ApplicationEvent{
    private static final long serialVersionUID = 1L;
    private String msg;
    public DemoEvent(Object source, String msg){
        super(source);
        this.msg = msg;
    }
    public String getMsg(){
        return msg;
    }
    public void setMsg(String msg){
        this.msg = msg;
    }
}
