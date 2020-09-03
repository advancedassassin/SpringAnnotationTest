package com.ydx.config;

import com.ydx.bean.Color;
import com.ydx.bean.Person;
import com.ydx.bean.Red;
import com.ydx.condition.LinuxCondition;
import com.ydx.condition.WindowsCondition;
import com.ydx.selector.MyImportSelector;
import org.springframework.context.annotation.*;

/**
 * @ClassName MainConfig2
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/1 14:15
 * @Version 1.0
 **/
@Configuration
// 快速导入组件，id是组件全类名
//@Import(Color.class)
//@Import({Color.class, Red.class})
@Import({MyImportSelector.class})
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
