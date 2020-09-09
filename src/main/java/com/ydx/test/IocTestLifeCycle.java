package com.ydx.test;

import com.ydx.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @ClassName IocTestLifeCycle
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/9 16:03
 * @Version 1.0
 **/
public class IocTestLifeCycle {

    @Test
    public void test1(){
        // 创建容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成");

        Object car = annotationConfigApplicationContext.getBean("car");
        Object car1 = annotationConfigApplicationContext.getBean("car");
        System.out.println(car == car1);
        annotationConfigApplicationContext.close();

    }
    @Test
    public void test2(){
        // 创建容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("容器创建完成");

        annotationConfigApplicationContext.close();

    }

}
