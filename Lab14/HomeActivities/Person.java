package lab14_homeactivities;

import java.io.Serializable;

public class Person implements Serializable {
    public String name = null;
    public int age = 0;

    public Person(){}

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: "+name+"\nAge: "+age;
    }
}