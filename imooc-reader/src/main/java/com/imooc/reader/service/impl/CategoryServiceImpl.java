package com.imooc.reader.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.imooc.reader.entity.Category;
import com.imooc.reader.mapper.CategoryMapper;
import com.imooc.reader.service.CategoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-04 14:19
 **/
@Service
//
@Transactional(propagation = Propagation.NOT_SUPPORTED,readOnly = true)
public class CategoryServiceImpl implements CategoryService {
    @Resource
    private CategoryMapper categoryMapper ;
    @Override
    public List<Category> selectAll() {
        List<Category> categoryList = categoryMapper.selectList(new QueryWrapper<Category>());
        return categoryList;
    }
}
