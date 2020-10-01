package com.ydx.bean;

import org.springframework.stereotype.Component;

/**
 * @ClassName Car
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/9 16:01
 * @Version 1.0
 **/
@Component
public class Car {

    public Car(){
        System.out.println("bean无参构造方法");
    }

    public void init(){
        System.out.println("init...初始化方法...");
    }

    public void destroy(){
        System.out.println("destroy...销毁方法...");
    }
}
