package Homework.Lesson24;

public class Pingvin extends Bird{
    Pingvin(String name) {
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Пингвин любит кушать рыбу.");
    }

    @Override
    void sleep() {
        System.out.println("Пингвины спят прижавшись друг  к другу.");

    }

    @Override
    void fly() {
        System.out.println("Пингвины не умеют летать.");

    }
    @Override
    public void speak(){
        System.out.println("Пингвины не умеют петь как соловьи.");

    }
}
