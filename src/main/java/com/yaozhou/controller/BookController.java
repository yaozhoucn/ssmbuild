package com.yaozhou.controller;

import com.yaozhou.pojo.Books;
import com.yaozhou.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
    public String toupdataBook(int id,Model model){
        Books books = bookService.querBookById(id);
        //把数据提交到前端页面
        model.addAttribute("Qbooks",books);
        return "updateBook";
    }
    //更改书籍
    @RequestMapping("updateBook")
    public String updateBook(Books books){
        int updateBook = bookService.updateBook(books);
        //重定向页面
        return "redirect:/book/allBook";
    }
    //删除书籍
    @RequestMapping("del/{bookId}")
    //restful分格，从前端取数据
    private String delBookById(@PathVariable("bookId") int id){
        System.out.println(id);
        int i = bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }

    //查询书籍
    @RequestMapping("selectBook")
    private String selectBook(String bookName,Model model){
        List<Books> list = bookService.querBook(bookName);
        model.addAttribute("list",list);
        System.out.println(list);
        return "allBook";

    }

}
