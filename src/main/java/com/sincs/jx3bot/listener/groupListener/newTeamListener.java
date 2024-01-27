package com.sincs.jx3bot.listener.groupListener;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simbot.event.GroupMessageEvent;
import org.springframework.stereotype.Component;

@Component
public class newTeamListener {
    @Listener
    @Filter(value = "\\.开团")
    public void listener(GroupMessageEvent groupMessageEvent) {
        System.out.printf(groupMessageEvent.getMessageContent().toString());
        groupMessageEvent.replyBlocking("test");

    }
}
