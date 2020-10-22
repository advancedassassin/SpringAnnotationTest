package com.ydx.test;

import com.ydx.config.MainConfig;
import com.ydx.ext.ExtConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTestExt {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);

        annotationConfigApplicationContext.close();
    }
}
