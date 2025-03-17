/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.core;

/**
 *
 * @author Luis Ernesto Nuñez
 */
public class Person {
    private int id, age;
    private String name;
    public Person(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", age=" + age + ", name=" + name + '}';
    }
    
    
    
}
