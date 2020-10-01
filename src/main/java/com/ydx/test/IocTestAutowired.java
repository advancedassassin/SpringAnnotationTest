package com.ydx.test;

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

}
