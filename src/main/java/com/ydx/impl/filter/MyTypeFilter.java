package com.ydx.impl.filter;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;


/**
 * @ClassName MyTypeFilter
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/8/30 14:22
 * @Version 1.0
 **/
public class MyTypeFilter implements TypeFilter {

    /**
     *metadataReader：读取到的当前正在扫描的类信息
     *metadataReaderFactory：可获取的其他任何的类信息
     **/

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        // 获取当前类注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前正在扫描类的信息，类是什么，实现什么接口
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类资源（路径在哪个盘）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        System.out.println(className);

        if (className.contains("er")) {
            return true;
        }
        return false;
    }
}
