package com.ydx.impl.registrar;

import com.ydx.bean.RainBow;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MyImportBeanDefinitionRegistrar
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/9/3 15:20
 * @Version 1.0
 **/
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    
    /**
     * @author Duxin Yuan
     * @description //描述一下这个方法的用途
     * @date 2020/9/3 15:21
     * @param importingClassMetadata 当前类注解信息
     * @param registry   BeanDefinition注册类，把所有需要添加到容器中的bean，调用BeanDefinitionRegistry.registerBeanDefinition手工注册进入容器
     * @return void
     **/
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        // 必须用全类名（@Import MyImportSelector注册进入的时候是全类名）
        boolean red = registry.containsBeanDefinition("com.ydx.bean.Red");
        // 必须用全类名（@Import MyImportSelector注册进入的时候是全类名）
        boolean blue = registry.containsBeanDefinition("com.ydx.bean.Blue");

        if (red && blue) {
            // BeanDefinition
            BeanDefinition beanDefinition = new RootBeanDefinition(RainBow.class);
            registry.registerBeanDefinition("rainBow", beanDefinition);
        }

    }
}
