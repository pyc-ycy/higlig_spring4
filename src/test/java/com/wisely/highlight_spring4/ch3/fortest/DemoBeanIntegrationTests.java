//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:DemoBeanIntegrationTests.java
// @User:彭友聪
//@Date:2019/11/03
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.fortest;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {TestConfig.class})
@ActiveProfiles("dev")
public class DemoBeanIntegrationTests {
    @Autowired
    private TestBean testBean;

    @Test
    public void prodBeanShouldInject(){
        String expected = "from development profile";
        String actual = testBean.getContent();
        Assert.assertEquals(expected, actual);
    }
}
