package com.example.demo;


// this is a class I build to make changes to the object created in the run time

// this is my second attempt to understand why am i not getting it properly?

// Hi this is Dhruv changing this file from another account to check the change happed in the file and how the hack is this git
// working basically
public class Main {
    String name;
    int Age;
    String addr;
    char gender;

    public Main(String name, int age, String addr, char gender) {
        this.name = name;
        Age = age;
        this.addr = addr;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
