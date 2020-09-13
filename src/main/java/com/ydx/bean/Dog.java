package com.ydx.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @ClassName Dog
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/13 16:33
 * @Version 1.0
 **/
@Component
public class Dog {

    public Dog(){
        System.out.println("dog无参构造方法");
    }
    // 对象调用并赋值之后调用
    @PostConstruct
    public void postConstruct(){
        System.out.println("Dog......PostConstruct");
    }

    // 容器移除对象之前的嗲用
    @PreDestroy
    public void preDestroy(){
        System.out.println("Dog......PreDestroy");
    }

}
