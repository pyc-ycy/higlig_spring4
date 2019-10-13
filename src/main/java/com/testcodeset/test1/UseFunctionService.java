//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:UseFunctionService.java
// @User:彭友聪
//@Date:2019/10/13
// Author:御承扬
//E-mail:2923616405@qq.com


package com.testcodeset.test1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UseFunctionService {
    @Autowired
    FunctionService functionService;
    public int countAB(int a, int b){
        return functionService.countAB(a, b);
    }
}
