package com.ydx;

import com.ydx.bean.Person;
import com.ydx.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

/**
 * @ClassName MainClass
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/8/30 12:13
 * @Version 1.0
 **///主测试类
public class MainClass {

    public static void main(String[] args) {
        // 1、加载xml方式
        /*ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("beans.xml");
        Person person1 = (Person)applicationContext1.getBean("person");
        System.out.println(person1);*/

        // 2、加载@Configuration方式
        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(MainConfig.class);

        // 3、通过类型id名称获取bean
        /*Person person2 = (Person)applicationContext2.getBean("person");
        System.out.println(person2);*/

        // 4、通过类型获取bean在容器中的id名称
        String[] beanNamesForType = applicationContext2.getBeanNamesForType(Person.class);

//        Arrays.asList(beanNamesForType).forEach(i -> System.out.println(i));

        for (String beanName: beanNamesForType) {
            System.out.println(beanName);
        }
    }

}
