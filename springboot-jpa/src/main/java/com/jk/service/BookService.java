package com.jk.service;

import com.jk.model.BookBean;

import java.util.List;

/**
 * 方法实现说明
 *
 * @author 王垚
 * <p>
 * $
 * @return $
 * @exception
 * @date $ $
 */
public interface BookService {
    List<BookBean> queryBookList();

    BookBean queryBookById(BookBean bookBean);

    void saves(BookBean bookBean);

    void deleteAlls(Integer[] ids);

    void delete(Integer id);
}
