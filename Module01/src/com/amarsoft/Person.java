package com.amarsoft;

/**
 * @Auther: ljlin
 * @Date: 2020/6/28 22:25
 * @Description: com.amarsoft
 * @version: 1.0
 */
public class Person {
    private String name;
    private  int age;
    private double length;

    public Person(String name, int age, double length) {
        this.name = name;
        this.age = age;
        this.length = length;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getLength() {
        return length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
