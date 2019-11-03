//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:TestBean.java
// @User:彭友聪
//@Date:2019/11/03
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.fortest;

public class TestBean {
    private String content;
    public TestBean(String  content){
        super();
        this.content = content;
    }

    public String getContent(){
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
