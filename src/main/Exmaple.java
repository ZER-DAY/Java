package main;

import models.Person;

public class Exmaple {
    public static void main(String[] args) {
        Person a = new Person();
        a.setName("cf");
        a.setAge(21);

        System.out.println(a.getName());
        System.out.println(a.getAge());
    }
}
