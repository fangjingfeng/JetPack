package com.example.jetpack.model.bean;

import java.util.List;

/**
 * User: ext.fangjingfeng
 * Date: 2020/9/25
 * Time: 11:08
 */
public class TabItemData {

    private String name;
    private int age;
    private List<String> list;

    public TabItemData(String name, int age, List<String> list) {
        this.name = name;
        this.age = age;
        this.list = list;
    }

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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }
}
