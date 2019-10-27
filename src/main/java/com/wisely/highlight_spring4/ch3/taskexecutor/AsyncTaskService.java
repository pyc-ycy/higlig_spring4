//@Software: IntelliJ IDEA
// @Project:higlig_spring4
//@File:AsyncTaskService.java
// @User:彭友聪
//@Date:2019/10/27
// Author:御承扬
//E-mail:2923616405@qq.com


package com.wisely.highlight_spring4.ch3.taskexecutor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class AsyncTaskService {
    @Async
    public void executorAsyncTask(Integer i){
        System.out.println("异步执行任务：" + i);
    }

    @Async
    public void executorAsyncTaskPlus(Integer i){
        System.out.println("执行异步任务+1：" + (i+1));
    }

    @Async
    public  void stopExecutorAsyncTask(){
        System.exit(0);
    }
}
