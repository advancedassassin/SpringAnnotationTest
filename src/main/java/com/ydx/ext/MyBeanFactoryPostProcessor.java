package com.ydx.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("MyBeanFactoryPostProcessor...postProcessBeanFactory");
        int beanDefinitionCount = configurableListableBeanFactory.getBeanDefinitionCount();
        String[] beanDefinitionNames = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println("当前BeanFactory中有"+beanDefinitionCount+"个bean");
        System.out.println(Arrays.asList(beanDefinitionNames));
    }
}
