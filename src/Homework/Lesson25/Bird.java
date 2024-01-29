package Homework.Lesson25;

abstract class Bird extends Animal implements Speakable {
    //constructor
    Bird(String name) {
        super(name);
    }

    //metod
    abstract void fly();
    public void speak(){};

}
