//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:WindowsListService.java
// @User:彭友聪
//@Date:2019/11/01
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.conditional;

public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
