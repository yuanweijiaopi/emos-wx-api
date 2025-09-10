package com.example.emos.wx.db.pojo;

import lombok.Data;

/**
 * @ClassName Student
 * @Description TODO
 * @Author aql
 * @Date 2025/4/16 17:26
 * @Version 1.0
 **/
@Data
public class Student {

    private String id;
    private String name;
    private String age;
    private Life life;

    public Student(String id, String name, String age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }


}


