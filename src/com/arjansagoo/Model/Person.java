package com.arjansagoo.Model;

public class Person {

    //Create variables for user personal details
    private String name;
    private String gender;
    private int age;
    private int weight;
    private int height;

    //Default Constructor
    public Person(String name, String gender, int age, int weight, int height) {
        setName(name);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setHeight(height);

//        this.name = name;
//        this.gender = gender;
//        this.age = age;
//        this.weight = weight;
//        this.height = height;
    }

    //Getters and Setters for each variable
    public String getName() {
        return this.name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return this.gender;
    }

    private void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return this.age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return this.weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return this.height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

}
