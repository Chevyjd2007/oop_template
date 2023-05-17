package com.Chevy;

public class employee {

    private String name;
    private int age;

    // Constructor for class
    public employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    //getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    //setters
    public void setName(){
        this.name = name;
    }

    public void setAge(){
        this.age = age;
    }

    //methods


    public void displayInfo(){
        System.out.println("This employee is " + this.name + " and is " + this.age + " old.");
    }
}
