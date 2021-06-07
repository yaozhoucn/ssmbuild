package com.yaozhou.controller;

import com.yaozhou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by WXHang on HANG at 2021/6/7 10:15
 * Desc：
 */
@Controller
@RequestMapping
public class BookController {
    //controller调用service层
    @Autowired
    @Qualifier("BooksServiceImp")
    private BookService bookService;
}
