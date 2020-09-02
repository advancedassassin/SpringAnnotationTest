package com.ydx.test;

import com.ydx.bean.Person;
import com.ydx.config.MainConfig;
import com.ydx.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @ClassName IocTest
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/8/30 13:38
 * @Version 1.0
 **/
public class IocTest {
    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        for (String beanName : beanDefinitionNames) {
            System.out.println(beanName);
        }

        Object person1 = annotationConfigApplicationContext.getBean("person");
        Object person2 = annotationConfigApplicationContext.getBean("person");

        System.out.println(person1 == person2);
    }


    @Test
    public void test02(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] beanDefinitionNames = annotationConfigApplicationContext.getBeanDefinitionNames();
//
//        for (String beanName : beanDefinitionNames) {
//            System.out.println(beanName);
//        }
//
        System.out.println("IOC容器獲取完成");
        Object person1 = annotationConfigApplicationContext.getBean("person");
        Object person2 = annotationConfigApplicationContext.getBean("person");
//
//        System.out.println(person1 == person2);
    }
    @Test
    public void test03(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig2.class);

        ConfigurableEnvironment environment = annotationConfigApplicationContext.getEnvironment();
        String osName = environment.getProperty("os.name");
        String osVersion = environment.getProperty("os.version");

        System.out.println(osVersion);

        String[] beanNamesForType = annotationConfigApplicationContext.getBeanNamesForType(Person.class);

        for (String name : beanNamesForType) {
            System.out.println(name);
        }
    }
}
