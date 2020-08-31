package com.ydx.bean;

import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName Person
 * @Description 描述一下该类用途
 * @Author Duxin Yuan
 * @Date 2020/8/30 12:07
 * @Version 1.0
 **/

public class Person {

    private String name;

    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
