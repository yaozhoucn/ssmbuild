package com.yaozhou.controller;

import com.yaozhou.pojo.Books;
import com.yaozhou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/6/7 10:15
 * Desc：
 */
@Controller
@RequestMapping("/book")
public class BookController {
    //controller调用service层
    @Autowired
    @Qualifier("BooksServiceImp")
    private BookService bookService;
    //查询所有书籍，并且返回一个书籍展示页面y
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        //返回前端展示
        return "allBook";
    }
    //跳转到增加书籍页面
    @RequestMapping("toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    //新增书籍
    @RequestMapping("addBook")
    public String addBook(Books books){
        int addBook = bookService.addBook(books);
        //重定向
        return "redirect:/book/allBook";
    }
    //跳转到更改书籍页面
    @RequestMapping("toUpdateBook")
    public String toupdataBook(Books books){

        return "updateBook";
    }
    //更改书籍
    @RequestMapping("updateBook")
    public String updateBook(Books books){
        System.out.println(books.getBookID());
        int updateBook = bookService.updateBook(books);
        return "allBook";
    }

}
