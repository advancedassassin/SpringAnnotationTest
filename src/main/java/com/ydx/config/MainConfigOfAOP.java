package com.ydx.config;

import com.ydx.aop.LogAspects;
import com.ydx.aop.MathCalculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @ClassName MainConfigOfAOP
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/2 13:53
 * @Version 1.0
 **/
@EnableAspectJAutoProxy
@Configuration
public class MainConfigOfAOP {

    @Bean
    public MathCalculator mathCalculator(){
        return new MathCalculator();
    }

    @Bean
    public LogAspects logAspects(){
        return new LogAspects();
    }

}
