package Homework.Lesson25;

abstract class Fish extends Animal {
    //constructor
    Fish(String name) {
        super(name);
    }

    //metod
    public void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы.");
    }

    abstract void swim();
}
