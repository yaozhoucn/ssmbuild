/*
package com.yaozhou.dao;

import com.yaozhou.pojo.Books;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

*/
/**
 * Created by WXHang on HANG at 2021/6/4 14:21
 * Desc：手动注入sqlsession
 *//*

public class BookMapperImp extends SqlSessionDaoSupport implements BookMapper{
    SqlSessionTemplate sqlSessionTemplate;

    @Override
    public int addBook(Books books) {
        SqlSessionFactory sqlSessionFactory = sqlSessionTemplate.getSqlSessionFactory();
        return 0;
    }

    @Override
    public int deleteBookById(int id) {
        return 0;
    }

    @Override
    public Books querBookById(int id) {
        return null;
    }

    @Override
    public int updateBook(Books books) {
        return 0;
    }

    @Override
    public List<Books> querAllBook() {
        return null;
    }
}
*/
