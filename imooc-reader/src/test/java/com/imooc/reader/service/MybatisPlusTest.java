package com.imooc.reader.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.imooc.reader.entity.Test;
import com.imooc.reader.mapper.TestMapper;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-04 12:56
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MybatisPlusTest {
    @Resource
    private TestMapper testMapper;

    @org.junit.Test
    public void TestMapper1() {
        Test test = new Test();
        test.setContent("hello world");
        testMapper.insert(test);
        //查询
        Test test1 = testMapper.selectById(29);
        System.out.println(test1);
        //更新
        test1.setContent("mybatisplus 更新操作");
        testMapper.updateById(test1);

        testMapper.selectById(30);
    }

    @org.junit.Test
    public void testSelect() {
        QueryWrapper<Test> queryWrapper = new QueryWrapper<>();
//        queryWrapper.eq("id", 29);
//        List<Test> testList = testMapper.selectList(queryWrapper);
//        System.out.println(testList.get(0));
        queryWrapper.gt("id",29);
        List<Test> testList = testMapper.selectList(queryWrapper);
        System.out.println(testList.get(0));

    }
}
