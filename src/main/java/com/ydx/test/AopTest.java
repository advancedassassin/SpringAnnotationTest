package com.ydx.test;

import com.ydx.aop.MathCalculator;
import com.ydx.config.MainConfig2;
import com.ydx.config.MainConfigOfAOP;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName AopTest
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/2 15:00
 * @Version 1.0
 **/
public class AopTest {

    @Test
    public void testAOP(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);
        MathCalculator bean = annotationConfigApplicationContext.getBean(MathCalculator.class);

        bean.div(1,0);
    }

}
