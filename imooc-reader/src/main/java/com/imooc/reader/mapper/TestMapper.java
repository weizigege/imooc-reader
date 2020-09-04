package com.imooc.reader.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.imooc.reader.entity.Test;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-03 16:50
 **/
public interface TestMapper extends BaseMapper<Test> {
    public void insertSample();
}
