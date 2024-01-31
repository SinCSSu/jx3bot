package com.sincs.jx3bot.listener.groupListener;

import love.forte.simboot.annotation.Filter;
import love.forte.simboot.annotation.Listener;
import love.forte.simbot.event.GroupMessageEvent;
import org.springframework.stereotype.Component;

import java.util.concurrent.CompletableFuture;

@Component
public class newTeamListener {

    @Listener
    @Filter(value = "^.开团 .+ .+ .+")
    public CompletableFuture<?> listener(GroupMessageEvent groupMessageEvent) {
        return groupMessageEvent.getGroup().sendAsync(groupMessageEvent.getMessageContent().getPlainText());
    }
}
