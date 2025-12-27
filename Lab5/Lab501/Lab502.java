package Lab501;

import java.util.Scanner;

class AnimalLab502 {

    protected String name;
    protected int age;

    public void makeSound() {
        System.out.println("I am an animal.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Cat extends Animal {

    public void makeSound() {
        System.out.println("Meow!");
    }
}

public class Lab502 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int age = input.nextInt();

        Cat cat = new Cat();

        cat.name = name;
        cat.age  = age;

        cat.displayInfo();  
        cat.makeSound();     

        input.close();
    }
}


