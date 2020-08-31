package com.ydx.config;

import com.ydx.bean.Person;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

/**
 * @ClassName MainConfig
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/8/30 12:16
 * @Version 1.0
 **/
// 配置类=配置文件
@Configuration //通知spring这是个配置类
//@ComponentScan(value = "com.ydx")
/*@ComponentScan(value = "com.ydx",excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {
                Controller.class
        })
})*/
@ComponentScans(value = {
        /*@ComponentScan(value = "com.ydx",excludeFilters = {
                @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {
                        Controller.class
                })
        })*/
        @ComponentScan(value = "com.ydx",includeFilters = {
                @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {
                        MyTypeFilter.class
                })
        },useDefaultFilters = false)
}
)
public class MainConfig {

    @Bean("person覆盖值")// 给容器注入一个bean，id默认用方法名作为id
    public Person person默认值(){
        return new Person("lisi",20);
    }

}
