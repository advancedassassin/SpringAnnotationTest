package com.ydx.controller;

import com.ydx.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @ClassName BookController
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/8/30 13:35
 * @Version 1.0
 **/
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

}
