package com.tqz.disruptor.demo.service;

public interface DisruptorMqService {

    /**
     * 消息
     *
     * @param message
     */
    void sayHelloMq(String message);
}