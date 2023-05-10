package Integrity.java_study;

public class Child extends Mother{
    int age;
    Child(){
        System.out.println("Child");
    }

    public void setAge(int age){
        this.age = age;
    }

    public void showAge(){
        System.out.println("아들의 age = " + age);
    }
}
