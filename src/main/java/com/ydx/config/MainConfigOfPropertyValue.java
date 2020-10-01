package com.ydx.config;

import com.ydx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MainConfigPropertyValue
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/30 15:52
 * @Version 1.0
 **/
@Configuration
public class MainConfigOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }

}
