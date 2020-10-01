package com.ydx.config;

import com.ydx.dao.BookDao;
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
@ComponentScan({"com.ydx.controller","com.ydx.dao","com.ydx.service"})
public class MainConfigOfAutowired {

    @Primary
    @Bean("bookDao2")
    public BookDao bookDao(){
        BookDao bookDao = new BookDao();
        bookDao.setLable("2");
        return bookDao;
    }

}
