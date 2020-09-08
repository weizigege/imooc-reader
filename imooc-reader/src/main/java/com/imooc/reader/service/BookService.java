package com.imooc.reader.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.imooc.reader.entity.Book;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-04 15:53
 **/
public interface BookService {
    /**
     * page 页号
     * rows 每页记录数
     * categoryId 分类编号
     * order 排序方式
     */
    public IPage<Book> paging(Long categoryId,String order,Integer page,Integer rows);

    public Book selectById(Long bookId);
}
