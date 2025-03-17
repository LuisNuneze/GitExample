/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.core;

/**
 *
 * @author Luis Ernesto Nuñez
 */
public class Dog {
    int age, peso, color;
    String raza;

    public Dog(int age, int peso, int color, String raza) {
        this.age = age;
        this.peso = peso;
        this.color = color;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Dog{" + "age=" + age + ", peso=" + peso + ", color=" + color + ", raza=" + raza + '}';
    }
    
}
