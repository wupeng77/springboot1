package com.hjl.bean;

import java.io.Serializable;

public class Student implements Serializable {

    private Integer age;

    private String name;

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
