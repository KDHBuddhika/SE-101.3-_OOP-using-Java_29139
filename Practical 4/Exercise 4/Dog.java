

package com.mycompany.dog;

public class Dog extends Mammal
{

    public static void main(String[] args) {
        Animal a = new Animal();
        Mammal m = new Mammal();
        Dog d = new Dog();

        System.out.println(m instanceof Animal); // true
        System.out.println(d instanceof Mammal); // true
        System.out.println(d instanceof Animal); // true
    }
}
