package com.imooc.reader.service.impl;

import com.imooc.reader.entity.Category;
import com.imooc.reader.service.CategoryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-04 14:23
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class CategoryServiceImplTest {

    @Resource
    private CategoryService categoryService;
    @Test
    public void selectAll() {
        List<Category> categoryList = categoryService.selectAll();
        System.out.println(categoryList);
    }
}