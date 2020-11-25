package com.ydx;

import com.ydx.bean.Person;
import com.ydx.config.MainConfigT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName MainTest
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/25 17:52
 * @Version 1.0
 **/
public class MainTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(MainConfigT.class);
        Person person2 = (Person)applicationContext2.getBean("person");
    }
}
