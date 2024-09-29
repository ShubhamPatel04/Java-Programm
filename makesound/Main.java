package com.makesound;

class Animal {
    public void makesound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makesound() {
        System.out.println("Dogs are barks:");
    }

}

class Cat extends Animal {
    @Override
    public void makesound() {
        System.out.println("Cats are Meows:");
    }

}

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Cat c = new Cat();
        a.makesound();
        d.makesound();
        c.makesound();
    }
}