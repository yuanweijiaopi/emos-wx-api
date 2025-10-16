package com.example.emos.wx.entity.pojo;

import lombok.Data;

/**
 * @ClassName Teacher
 * @Description TODO
 * @Author aql
 * @Date 2025/4/16 17:26
 * @Version 1.0
 **/
@Data
public class Teacher {
    private String id;
    private String name;
    private Life life;

    public Teacher(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Teacher() {}



}
