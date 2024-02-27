package OOP;

public class Abstraction {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}


abstract class Animal2{

    abstract void makeSound();

    void eat(){
        System.out.println("Animal is eating");

    }
}



class Dog extends Animal2{
    void makeSound(){
        System.out.println("Woof");
    }

    Dog.
}


