package com.ydx.config;

import com.ydx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName MainConfig2
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/1 14:15
 * @Version 1.0
 **/
@Configuration
public class MainConfig2 {
    // 默认是单实例的
//    @Scope("prototype")
    @Bean("person")
    public Person person(){
        System.out.println("给容器中注入person。。。");
        return new Person("zhangsan",25);
    }

}
