package com.tqz.disruptor.demo.eventfactory;

import com.lmax.disruptor.EventFactory;
import com.tqz.disruptor.demo.model.MessageModel;

/**
 * 事件工厂。
 *
 * @author tianqingzhao
 * @since 2023/11/15 8:58
 */
public class HelloEventFactory implements EventFactory<MessageModel> {

    @Override
    public MessageModel newInstance() {
        return new MessageModel();
    }
}
