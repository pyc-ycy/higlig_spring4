//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:TaskScheduleConfig.java
// @User:彭友聪
//@Date:2019/10/27
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.taskScheduler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.taskScheduler")
@EnableScheduling
public class TaskScheduleConfig {
}
