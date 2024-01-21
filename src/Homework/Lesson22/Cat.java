package Homework.Lesson22;

public class Cat extends Pet{
    Cat(String name){
        this.name=name;
        System.out.println("I am cat and my name: "+ name);
    }
    public void sleep(){
        System.out.println("Cat sleep.");
    }
}
