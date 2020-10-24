package com.ydx.ext;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyApplicationListener
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/24 19:52
 * @Version 1.0
 **/
@Component
public class MyApplicationListener implements ApplicationListener {

    // 容器中发布此事件后方法触发
    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("监听到事件"+event);
    }
}
