package com.cblog.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by chencc on 2018/10/12.
 * 自带的的定时任务，5秒打印一次
 */
@Component
public class SchedulerTask {
    private final Logger LOG = LoggerFactory.getLogger(getClass());
    @Scheduled(fixedRate = 5000)
    private void dateTask() {
        LOG.info("SchedulerTask2 : " + new Date().toString());
        System.out.println("hello world form quartZ");
    }
}
