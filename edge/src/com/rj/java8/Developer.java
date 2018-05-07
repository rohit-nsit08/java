package com.rj.java8;

import java.math.BigDecimal;

public class Developer {

    private int age;
    private String name;
    private BigDecimal salary;

    public Developer(String name, BigDecimal salary, int age) {
        this.name = name;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                '}';
    }
}
