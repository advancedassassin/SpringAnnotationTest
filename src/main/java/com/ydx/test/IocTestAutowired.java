package com.ydx.test;

import com.ydx.bean.Boss;
import com.ydx.bean.Car;
import com.ydx.bean.Color;
import com.ydx.config.MainConfigOfAutowired;
import com.ydx.dao.BookDao;
import com.ydx.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName IocTestAutowired
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/1 15:48
 * @Version 1.0
 **/
public class IocTestAutowired {

    @Test
    public void test(){

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        BookService bookService = annotationConfigApplicationContext.getBean(BookService.class);

        System.out.println(bookService);

        BookDao bean = annotationConfigApplicationContext.getBean(BookDao.class);

        System.out.println(bean);

        annotationConfigApplicationContext.close();

    }


    @Test
    public void test1(){

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        Boss bean = annotationConfigApplicationContext.getBean(Boss.class);

        System.out.println(bean);

        Car bean1 = annotationConfigApplicationContext.getBean(Car.class);

        System.out.println(bean1);

        annotationConfigApplicationContext.close();

    }


    @Test
    public void test2(){

        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAutowired.class);

        Color bean = annotationConfigApplicationContext.getBean(Color.class);

        System.out.println(bean);

        Car bean1 = annotationConfigApplicationContext.getBean(Car.class);

        System.out.println(bean1);

        annotationConfigApplicationContext.close();

    }
}
