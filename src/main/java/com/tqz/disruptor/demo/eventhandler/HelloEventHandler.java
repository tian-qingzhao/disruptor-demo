package com.tqz.disruptor.demo.eventhandler;

import com.lmax.disruptor.EventHandler;
import com.tqz.disruptor.demo.model.MessageModel;
import lombok.extern.slf4j.Slf4j;

/**
 * 消费者。
 *
 * @author tianqingzhao
 * @since 2023/11/15 8:59
 */
@Slf4j
public class HelloEventHandler implements EventHandler<MessageModel> {

    @Override
    public void onEvent(MessageModel event, long sequence, boolean endOfBatch) throws Exception {
        try {
            //这里停止1000ms是为了确定消费消息是异步的
            Thread.sleep(1000);
            log.info("消费者处理消息开始");
            if (event != null) {
                log.info("消费者消费的信息是：{}",event);
            }
        } catch (Exception e) {
            log.info("消费者处理消息失败");
        }
        log.info("消费者处理消息结束");
    }
}
