package com.sincs.jx3bot.starter;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simbot.event.GroupMessageEvent;
import org.springframework.stereotype.Component;

@Component
public class testListener {
    @Listener
    @Filter(value = "test")
    public void test(GroupMessageEvent groupMessageEvent) {
        groupMessageEvent.replyBlocking("test");
    }
}
