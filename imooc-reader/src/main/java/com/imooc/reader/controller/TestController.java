package com.imooc.reader.controller;

import com.fasterxml.jackson.annotation.JsonCreator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-02 15:59
 **/
@Controller
public class TestController {
    @GetMapping("/test/test1")
    public ModelAndView test1(){
        return new ModelAndView("/test");
    }
    @GetMapping("/test/test2")
    @ResponseBody
    public Map test2(){
        Map result=new HashMap<>();
        result.put("test","测试内容");
        return result;
    }
}
