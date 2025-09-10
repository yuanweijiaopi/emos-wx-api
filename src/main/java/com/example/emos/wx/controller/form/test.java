package com.example.emos.wx.controller.form;

import com.example.emos.wx.db.pojo.Life;
import com.example.emos.wx.db.pojo.Student;
import com.example.emos.wx.db.pojo.Teacher;
import org.springframework.beans.BeanUtils;

import java.util.UUID;

/**
 * @ClassName test
 * @Description TODO
 * @Author aql
 * @Date 2025/4/16 17:27
 * @Version 1.0
 **/
public class test {

    public static void main(String[] args) {
        Student student = new Student(UUID.randomUUID().toString(),"张三","18");
        Life life=new Life("young");
        student.setLife(life);

        Teacher teacher = new Teacher();
        System.out.println(student.toString());

        BeanUtils.copyProperties(student,teacher);
        teacher.getLife().setLife("old");
        System.out.println(student.toString());
    }
}
