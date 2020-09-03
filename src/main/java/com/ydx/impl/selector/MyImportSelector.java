package com.ydx.impl.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MyImportSelector
 * @Description 自定义逻辑返回需要import组件
 * @Author Duxin Yuan
 * @Date 2020/9/3 14:38
 * @Version 1.0
 **/
public class MyImportSelector implements ImportSelector {
    // 返回值类型就是导入到容器中的全类名
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // AnnotationMetadata  当前标注@Import注解类的所有注解信息（注解名、注解值）


        return new String[]{"com.ydx.bean.Blue","com.ydx.bean.Yellow"};
    }
}
