package com.tqz.disruptor.demo.test;

import com.tqz.disruptor.demo.DisruptorApplication;
import com.tqz.disruptor.demo.service.DisruptorMqService;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author tianqingzhao
 * @since 2023/11/15 9:24
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = DisruptorApplication.class)
public class MqManagerTest {


    @Autowired
    private DisruptorMqService disruptorMqService;
    /**
     * 项目内部使用Disruptor做消息队列
     * @throws Exception
     */
    @Test
    public void sayHelloMqTest() throws Exception{
        disruptorMqService.sayHelloMq("消息到了，Hello world!");
        log.info("消息队列已发送完毕");
        //这里停止2000ms是为了确定是处理消息是异步的
        Thread.sleep(2000);
    }

}
