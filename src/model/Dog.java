package model;

import model.Animal;
import model.AnimalBehaviour;

public class Dog extends Animal implements AnimalBehaviour {
    @Override
    public void eat(){
        System.out.println("model.Dog is eating");
    }

    @Override
    public void makeSound() {
        System.out.println("barking");
    }

    @Override
    public void walking(){
        System.out.println("dog is walking");
    }

    @Override
    public void sleep(){
        System.out.println("dog is eating");
    }

    @Override
    public void exercise() {
        System.out.println("dog is exercising");
    }

    public void specialDogMethod(){
        System.out.println("specialDogMethod");
    }
}
