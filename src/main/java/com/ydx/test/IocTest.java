package com.ydx.test;

import com.ydx.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
    }
}
