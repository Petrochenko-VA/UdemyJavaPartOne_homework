package Homework.Lesson25;

abstract class Animal {
    //variables
    String name;

    //constructor
    Animal(String name) {
        this.name = name;
    }

    //metod
    abstract void eat();

    abstract void sleep();
}
