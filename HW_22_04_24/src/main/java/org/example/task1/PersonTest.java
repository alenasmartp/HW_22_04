package org.example.task1;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Anna", 38);
        person1.move();
        person2.talk();

    }
}
