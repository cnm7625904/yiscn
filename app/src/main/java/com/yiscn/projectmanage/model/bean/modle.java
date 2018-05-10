package com.yiscn.projectmanage.model.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/3/2.
 */

public class modle implements Serializable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
  private int age;
}
