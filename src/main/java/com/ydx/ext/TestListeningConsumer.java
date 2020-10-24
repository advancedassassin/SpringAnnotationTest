package com.ydx.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestListeningConsumer
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/24 21:24
 * @Version 1.0
 **/
@Service
public class TestListeningConsumer {

    @EventListener(classes = {ApplicationEvent.class})
    public void onMessage(ApplicationEvent event){
        System.out.println("ApplicationListenere收到了"+event);
    }
}
