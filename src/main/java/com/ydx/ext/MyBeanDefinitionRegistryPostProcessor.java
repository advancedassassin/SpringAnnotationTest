package com.ydx.ext;

import com.ydx.bean.Blue;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.*;
import org.springframework.stereotype.Component;

/**
 * @ClassName MyBeanDefinitionRegistryPostProcessor
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/24 18:36
 * @Version 1.0
 **/
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {


    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor的postProcessBeanDefinitionRegistry...");
        System.out.println("bean定义信息数量"+registry.getBeanDefinitionCount());
        // 法1用RootBeanDefinition()手动加bean
        RootBeanDefinition beanDefinition1 = new RootBeanDefinition(Blue.class);
        registry.registerBeanDefinition("manualBlue1",beanDefinition1);
        // 法二用BeanDefinitionBuilder手动加bean
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(Blue.class);
        AbstractBeanDefinition beanDefinition2 = beanDefinitionBuilder.getBeanDefinition();
        registry.registerBeanDefinition("manualBlue2",beanDefinition2);
    }

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("MyBeanDefinitionRegistryPostProcessor的postProcessBeanFactory...");
        System.out.println("bean定义信息数量"+beanFactory.getBeanDefinitionCount());

    }
}
