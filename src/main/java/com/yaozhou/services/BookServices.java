package com.yaozhou.services;

import com.yaozhou.pojo.Books;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/6/4 12:57
 * Desc：
 */
public interface BookServices {
    //增加一本书
    int addBook(Books books);

    //删除一本书

    int deleteBookById(int id);
    //根据id查询一本书

    Books querBookById( int id);

    //更新一本书】
    int updateBook(Books books);


    //查询全部书籍
    List<Books> querAllBook();
}
