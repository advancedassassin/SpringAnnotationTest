package com.ydx.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @ClassName ColorFactory
 * @Description 創建一個spring定義的工廠bean
 * @Author Duxin Yuan
 * @Date 2020/9/3 17:14
 * @Version 1.0
 **/
public class ColorFactoryBean implements FactoryBean<Color> {
    // 返回一個color-bean對象，對象會添加到容器中
    public Color getObject() throws Exception {
        System.out.println("得到了FactoryBean");
        return new Color();
    }

    public Class<?> getObjectType() {
        return Color.class;
    }

    // 是否是單例，true表示是單實例在容器中保存一份，否則多實例每次獲取就會創建一個新的
    public boolean isSingleton() {
        return true;
    }
}
