package com.yaozhou.dao;

import com.yaozhou.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;


/**
 * Created by WXHang on HANG at 2021/6/2 22:51
 */
public interface BookMapper {
    //增加一本书
    int addBook(Books books);

    //删除一本书

    int deleteBookById(@Param("bookId") int id);
    //根据id查询一本书

    Books querBookById(@Param("bookId") int id);

    //更新一本书】
    int updateBook(Books books);


    //查询全部书籍
    List<Books> queryAllBook();
}
