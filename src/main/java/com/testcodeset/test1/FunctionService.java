//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:FunctionService.java
// @User:彭友聪
//@Date:2019/10/13
// Author:御承扬
//E-mail:2923616405@qq.com


package com.testcodeset.test1;

import org.springframework.stereotype.Service;

@Service
public class FunctionService {
    public int countAB(int a, int b) {
        return a + b;
    }
}
