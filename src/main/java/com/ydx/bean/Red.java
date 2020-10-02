package com.ydx.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @ClassName Red
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/3 14:34
 * @Version 1.0
 **/
@Component
public class Red implements ApplicationContextAware {

    private ApplicationContext applicationContext;


    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
