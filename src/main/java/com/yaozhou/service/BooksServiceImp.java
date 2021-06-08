package com.yaozhou.service;

import com.yaozhou.dao.BookMapper;
import com.yaozhou.pojo.Books;

import java.util.List;

/**
 * Created by WXHang on HANG at 2021/6/4 12:58
 * Desc：
 */
public class BooksServiceImp implements BookService {
    //servies 调dao层：组合dao层
    private BookMapper bookMapper;

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBook(Books books) {

        return bookMapper.addBook(books);
    }

    @Override
    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    @Override
    public Books querBookById(int id) {
        Books books = bookMapper.querBookById(id);
        return books;
    }

    @Override
    public int updateBook(Books books) {

        return bookMapper.updateBook(books);
    }

    @Override
    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    @Override
    public List<Books> querBook(String bookName) {
        return bookMapper.querBook(bookName);
    }

}
