package com.ydx.config;

import com.ydx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * @ClassName MainConfigT
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/11/25 17:31
 * @Version 1.0
 **/
public class MainConfigT {

    @Scope("prototype")
    @Bean
    public Person person(){
        System.out.println("给容器中注入person。。。");
        return new Person("zhangsan",25);
    }
}
