package com.ydx.test;

import com.ydx.aop.MathCalculator;
import com.ydx.config.MainConfigOfAOP;
import com.ydx.tx.TxConfig;
import com.ydx.tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TxTest {

    @Test
    public void testTX(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
        userService.insertUser();


    }

}
