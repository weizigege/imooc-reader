package com.imooc.reader.service;

import com.imooc.reader.entity.Category;

import java.util.List;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-04 14:17
 **/
public interface CategoryService {
    public List<Category> selectAll();
}
