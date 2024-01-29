package Homework.Lesson25;

public class Mechenosec   extends Fish {
    //constructor
    Mechenosec(String name) {
        super(name);
    }
    //metod
    @Override
    void eat() {
        System.out.println("Меченосец не хитрая рыба и она ест обычный рыбий корм");
    }

    @Override
    void swim() {
        System.out.println("Меченосец красивая рыба, которая быстро плавает.");
    }
}
