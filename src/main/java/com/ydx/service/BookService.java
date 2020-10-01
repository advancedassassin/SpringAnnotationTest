package com.ydx.service;

import com.ydx.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.inject.Inject;

/**
 * @ClassName BookService
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/8/30 13:36
 * @Version 1.0
 **/
@Service
public class BookService {

//    @Qualifier("bookDao")
//    @Autowired(required = false)
//    @Autowired
//    @Resource(name = "bookDao2")
//    @Resource
    @Inject
    private BookDao bookDao;

    public void print(){
        System.out.println(bookDao);
    }

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao +
                '}';
    }
}
