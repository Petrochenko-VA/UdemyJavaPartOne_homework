package Homework.Lesson24;

public class Lesson24 {
    public static void main(String[] args) {
        Mechenosec mechenosec = new Mechenosec("Mechenos");
        System.out.println(mechenosec.name);
        mechenosec.swim();
        mechenosec.eat();
        mechenosec.sleep();

        Speakable speakable = new Pingvin("Pingvin_Speakable");
        speakable.speak();

        Animal animal = new Lev("Lev_Animal");
        System.out.println(animal.name);
        animal.eat();
        animal.sleep();

        Mammal mammal = new Lev("Lev_mammal");
        System.out.println(mammal.name);
        mammal.run();
        mammal.speak();
        mammal.eat();
        mammal.sleep();

    }
}
