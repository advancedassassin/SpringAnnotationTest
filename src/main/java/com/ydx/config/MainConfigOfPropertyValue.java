package com.ydx.config;

import com.ydx.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @ClassName MainConfigPropertyValue
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/30 15:52
 * @Version 1.0
 **/
@Configuration
// 使用@PropertySource读取外部配置文件中的k/v保存到运行环境变量中，加载完毕后用${}取出值
@PropertySource(value = {"classpath:person.properties"})
public class MainConfigOfPropertyValue {

    @Bean
    public Person person(){
        return new Person();
    }

}
