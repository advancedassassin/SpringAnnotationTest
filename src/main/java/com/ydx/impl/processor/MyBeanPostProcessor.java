package com.ydx.impl.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanPostProcessor
 * @Description 后置处理器，初始化前后进行处理工作，将后置处理器加入容器中
 * @Author Duxin Yuan
 * @Date 2020/9/13 16:50
 * @Version 1.0
 **/
//@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("postProcessBeforeInitialization-----beanName-----"+beanName+"------bean------"+bean);

        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

        System.out.println("postProcessAfterInitialization-----beanName-----"+beanName+"-----bean-----"+bean);
        return bean;
    }
}
