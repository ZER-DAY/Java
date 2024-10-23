package main;

import models.Person;

public class Main {
    public static void main(String[] args) {
        Person a = new Person("bahaa", 12);  // إنشاء كائن من فئة Person

//        a.setAge(12);`
//        a.setName("bahaa");
        System.out.println(a.getName());

//        Tools.pi= 12;
        int result = Tools.factorel(5);
        System.out.println(result);

        System.out.println(Tools.pi);


    }
}
