package com.ydx.config;

import com.ydx.bean.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName MainConfigOfLife
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/9 15:51
 * @Version 1.0
 **/
@ComponentScan("com.ydx.bean")
@Configuration
public class MainConfigOfLifeCycle {
//    @Scope("prototype")
//    @Bean(initMethod = "init",destroyMethod = "destroy")
//    public Car car(){
//        return new Car();
//    }

}
