package com.ydx.config;

import com.ydx.bean.Car;
import com.ydx.bean.Color;
import com.ydx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @ClassName MainConfigOfAutoWired
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/10/1 15:37
 * @Version 1.0
 **/
@Configuration
@ComponentScan({"com.ydx.controller","com.ydx.dao","com.ydx.service","com.ydx.bean"})
public class MainConfigOfAutowired {

//    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }
    /**
     * @author Duxin Yuan
     * @description @Autowired 可省略
     * @date 2020/10/1 18:08
     * @param car
     * @return com.ydx.bean.Color
     **/
    @Bean
    public Color color(@Autowired Car car){

        Color color = new Color();
        color.setCar(car);

        return color;
    }

}
