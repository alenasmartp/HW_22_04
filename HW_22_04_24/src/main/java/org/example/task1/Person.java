package org.example.task1;

public class Person {
    private String fullName;
    private int age;

    public void move() {
        System.out.println(fullName + " moves.");
    }

    public void talk() {
        System.out.println(fullName + " talks.");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }
}


