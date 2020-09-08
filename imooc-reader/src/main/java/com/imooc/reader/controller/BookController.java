package com.imooc.reader.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.reader.entity.Book;
import com.imooc.reader.entity.Category;
import com.imooc.reader.service.BookService;
import com.imooc.reader.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-04 14:59
 **/
@Controller
public class BookController {
    @Resource
    private CategoryService categoryService;
    @Resource
    private BookService bookService;

    @GetMapping("/")
    public ModelAndView showIndex() {
        ModelAndView modelAndView = new ModelAndView("/index");
        List<Category> categoryList = categoryService.selectAll();
        modelAndView.addObject("categoryList", categoryList);
        return modelAndView;
    }

    @GetMapping("/books")
    @ResponseBody
    public IPage<Book> selectall(Long categoryId, String order, Integer p) {
        if (p == null) {
            p = 1;
        }
        IPage<Book> pageObject = bookService.paging(categoryId, order, p, 10);
        return pageObject;
    }

    @GetMapping("/book/{id}")
    public ModelAndView showdetail(@PathVariable("id") Long id) {
        Book book = bookService.selectById(id);
        ModelAndView model = new ModelAndView("/detail");
        model.addObject("book", book);
        return model;
    }
}
