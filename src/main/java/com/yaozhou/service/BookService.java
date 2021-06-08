package com.yaozhou.service;

import com.yaozhou.pojo.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/6/4 12:57
 * Desc：
 */
@Service
public interface BookService {
    //增加一本书
    int addBook(Books books);

    //删除一本书

    int deleteBookById(int id);
    //根据id查询一本书

    Books querBookById(int id);

    //更新一本书】
    int updateBook(Books books);


    //查询全部书籍
    List<Books> queryAllBook();
}
