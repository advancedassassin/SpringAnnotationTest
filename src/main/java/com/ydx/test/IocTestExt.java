package com.ydx.test;

import com.sun.javafx.embed.AbstractEvents;
import com.ydx.config.MainConfig;
import com.ydx.ext.ExtConfig;
import com.ydx.ext.MyEvent;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IocTestExt {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ExtConfig.class);

        annotationConfigApplicationContext.publishEvent(new MyEvent());

        annotationConfigApplicationContext.close();
    }
}
