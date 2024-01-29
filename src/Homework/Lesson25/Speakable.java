package Homework.Lesson25;

public interface Speakable {
    default void speak(){
        System.out.println("Somebody speaks.");
    };

}
