package com.ydx.config;

import com.ydx.bean.Person;
import com.ydx.condition.LinuxCondition;
import com.ydx.condition.WindowsCondition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
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
    // 如果是windows系统，注册bill，如果是linux注册linus
    // @Conditional({Condition数组})按照一定条件给容器中注入bean
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        return new Person("Bill Gates",61);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02(){
        return new Person("linus",48);
    }

}
