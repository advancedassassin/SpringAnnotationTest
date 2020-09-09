package com.ydx.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @ClassName Cat
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/9 16:17
 * @Version 1.0
 **/
@Component
public class Cat implements InitializingBean, DisposableBean {

    public Cat(){
        System.out.println("cat无参构造方法");
    }

    public void destroy() throws Exception {
        System.out.println("cat...destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat...afterPropertiesSet");
    }
}
