package com.jk.service.impl;

import com.jk.dao.BookDao;
import com.jk.model.BookBean;
import com.jk.service.BookService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
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
@Service("bookService")
public class BookServiceImpl implements BookService {
    @Resource
    private BookDao bookDao;

    @Override
    public List<BookBean> queryBookList() {
        return bookDao.findAll();
    }

    @Override
    public BookBean queryBookById(BookBean bookBean) {
        Integer id = bookBean.getId();
        return bookDao.findOne(id);
    }

    @Override
    public void saves(BookBean bookBean) {
        /*BookBean book=new BookBean();
        book.setName(bookBean.getName());
        book.setPrice(bookBean.getPrice());
        book.setRiqi(bookBean.getRiqi());*/
        bookDao.saveAndFlush(bookBean);
    }

    @Override
    public void deleteAlls(Integer[] ids) {
        for (int i=0;i<ids.length;i++){
            BookBean bookBean = new BookBean();
            bookBean.setId(ids[i]);
            bookDao.delete(bookBean);
        }
    }

    @Override
    public void delete(Integer id) {
        bookDao.delete(id);
    }
}
