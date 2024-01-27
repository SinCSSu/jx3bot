package com.sincs.jx3bot.starter.protocol;

import jakarta.annotation.PostConstruct;
import net.mamoe.mirai.utils.BotConfiguration;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import xyz.cssxsh.mirai.tool.FixProtocolVersion;

import javax.inject.Inject;
import javax.inject.Named;
import java.io.IOException;


@Component
@Named
public class GetProtocol {

    @Inject
    private ResourceLoader resourceLoader;

    @PostConstruct
    public void load() {
        try {
            Resource resource = resourceLoader.getResource("classpath:simbot-bots/android_phone.json");
            FixProtocolVersion.load(BotConfiguration.MiraiProtocol.ANDROID_PHONE, resource.getFile());
        } catch (NoSuchFieldError e) {
            System.out.printf(e.toString());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
