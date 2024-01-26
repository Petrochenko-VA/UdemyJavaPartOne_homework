package Homework.Lesson24;

public class Lev extends Mammal{
    Lev(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Лев как любой хищник любит мясо.");
    }

    @Override
    void sleep() {
        System.out.println("Большую часть дня лев спит.");

    }

    @Override
    void run() {
        System.out.println("Лев это самая быстрая кошка.");

    }
}
