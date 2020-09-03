package com.imooc.reader.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-03 17:11
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class TestServiceTest {

    @Resource
    private TestService testService;
    @Test
    public void batchImport() {
        testService.batchImport();
    }
}