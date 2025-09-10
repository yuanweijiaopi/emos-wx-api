package com.example.emos.wx.db.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * user
 */
@Data
public class User implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private static final long serialVersionUID = 1L;
}