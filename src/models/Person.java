package models;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("iam constracter with  params");
    }

    public Person() {
        System.out.println("iam constracter whitout  params");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name == ""){
           System.out.println("Name is empty");
       }else{
           this.name = name;
       }
    }

    public void setAge(int age) {
        if(age < 0){
            this.age = 0;
        }else {
            this.age = age;
        }
    }
}