//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:WindowsCondition.java
// @User:彭友聪
//@Date:2019/11/01
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.conditional;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class WindowsCondition  implements Condition{
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata){
        return context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
