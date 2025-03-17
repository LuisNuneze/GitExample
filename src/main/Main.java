/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import main.core.Dog;
import main.core.Person;

/**
 *
 * @author Luis Ernesto Nuñez
 */
public class Main {
    public static void main(String[] args) {
        Person x;
        Dog y; 
        x = new Person(10000,17,"Carlos");
        y = new Dog(10, 10,10, "Dalmata");
        System.out.println(x);
        System.out.println(y);
    }
}
