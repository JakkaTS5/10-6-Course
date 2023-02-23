package main;

import entity.Cat;
import entity.Dog;

public class main {
    public static void main(String[] args) {
        Cat tom = new Cat("tom bang phuong thuc khoi tao", 2);
        // tom.setName("Tom dz");
        System.out.println(tom.getName());

        Dog dog = new Dog();
        dog.setName("Trum");
        System.out.println(dog.getName());
    }

}
