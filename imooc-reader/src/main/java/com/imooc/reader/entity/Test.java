package com.imooc.reader.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

/**
 * @program: imooc-reader
 * @description
 * @author: hu
 * @create: 2020-09-04 12:49
 **/
@TableName("test") //实体和表的关系
public class Test {
    @TableId(type = IdType.AUTO) //主键
    @TableField("id")
    private Integer id;
    //映射数据库字段 满足驼峰命名可以省略tabkefield
    @TableField("content")
    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
