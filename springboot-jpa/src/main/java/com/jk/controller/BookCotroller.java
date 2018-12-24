package com.jk.controller;

import com.jk.model.BookBean;
import com.jk.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
@Controller
@RequestMapping("book")
public class BookCotroller {

    @Resource
    private BookService bookService;

    @RequestMapping("toBook")
    public String toBook(){
        System.out.println("123");

        return "book";
    }

    @RequestMapping("queryBookList")
    @ResponseBody
    public List<BookBean> queryBookList(){
        List<BookBean> list=bookService.queryBookList();
        return list;
    }
    @RequestMapping("queryBookById")
    @ResponseBody
    public BookBean queryBookById(BookBean bookBean){
        BookBean book=bookService.queryBookById(bookBean);
        return book;
    }
    @RequestMapping("save")
    @ResponseBody
    public void saves(BookBean bookBean){
        bookService.saves(bookBean);
    }
    @RequestMapping("deleteAlls")
    @ResponseBody
    public void deleteAll(Integer[] ids){
        bookService.deleteAlls(ids);
    }
    @RequestMapping("delete")
    @ResponseBody
    public void delete(Integer id){
        bookService.delete(id);
}
}
