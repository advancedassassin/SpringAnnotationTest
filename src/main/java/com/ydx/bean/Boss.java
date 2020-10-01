package com.ydx.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName Boss
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/1 17:43
 * @Version 1.0
 **/
@Component
public class Boss {

    private Car car;

    @Autowired
    public Boss(Car car){
        this.car = car;
        System.out.println("Boss的有参数构造器。。。");
    }

    public Car getCar() {
        return car;
    }

//    @Autowired// 标注在方法上，spring容器创建当前对象时候，就会调用方法，完成赋值
    // 方法使用到的参数，自定义类型的值从ioc容器中获取
    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Boss{" +
                "car=" + car +
                '}';
    }
}
