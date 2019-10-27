//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:ScheduleTaskService.java
// @User:彭友聪
//@Date:2019/10/27
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.taskScheduler;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
@Service
public class ScheduleTaskService {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime(){
        System.out.println("每隔五秒执行一次" + dateFormat.format(new Date()));
    }
    @Scheduled(cron = "0 28 11 ? * *")
    public void fixedTimeExecution(){
        System.out.println("在指定时间" + dateFormat.format(new Date()) + "执行");
    }
}
