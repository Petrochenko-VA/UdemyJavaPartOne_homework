package Homework.Lesson24;

abstract class Mammal extends Animal implements Speakable {
    //constructor
    Mammal(String name) {
        super(name);
    }

    //metod
    abstract void run();
    @Override
    public void speak(){
        System.out.println(name + " sings");
    };
}
