package com.ydx.impl.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @ClassName WindowsCondition
 * @Description 判断系统是否是win系统
 * @Author Duxin Yuan
 * @Date 2020/9/2 14:18
 * @Version 1.0
 **/
public class WindowsCondition implements Condition {
    /**
     * @author Duxin Yuan
     * @description ConditionContext,判断条件使用的上下文（环境） AnnotatedTypeMetadata 注释信息
     * @date 2020/9/2 14:19
     * @param context
     * @param metadata
     * @return boolean
     **/
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 可以获取bean工厂
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        // 可以获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        // 可以获取当前环境信息
        Environment environment = context.getEnvironment();
        // 可以获取bean定义的注册类（这个类很重要，可以对bean的定义信息进行增删改查）
        BeanDefinitionRegistry registry = context.getRegistry();

        if (environment.getProperty("os.name").contains("Windows")){
            return true;
        }
        return false;
    }
}
