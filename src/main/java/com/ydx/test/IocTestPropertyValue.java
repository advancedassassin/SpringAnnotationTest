package com.ydx.test;

import com.ydx.bean.Person;
import com.ydx.config.MainConfigOfLifeCycle;
import com.ydx.config.MainConfigOfPropertyValue;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName IocTestPropertyValue
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/30 15:54
 * @Version 1.0
 **/
public class IocTestPropertyValue {

    @Test
    public void test(){
        // 创建容器
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfPropertyValue.class);
        System.out.println("容器创建完成");
        printBeans(annotationConfigApplicationContext);

        Person person = (Person) annotationConfigApplicationContext.getBean("person");

        System.out.println(person);
        annotationConfigApplicationContext.close();

    }

    private void printBeans(AnnotationConfigApplicationContext annotationConfigApplicationContext){
        String[] beanNames = annotationConfigApplicationContext.getBeanDefinitionNames();

        for (String name : beanNames) {
            System.out.println(name);
        }
    }

}
