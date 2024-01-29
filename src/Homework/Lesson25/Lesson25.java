package Homework.Lesson25;


public class Lesson25 {
    public static void main(String[] args) {
        Speakable s1 = new Bird("Ptitca") {
            @Override
            void fly() {
            }

            @Override
            void eat() {
            }

            @Override
            void sleep() {
            }
        };
        Speakable s2 = new Pingvin("Ping");
        Speakable s3 = new Mammal("mammal") {
            @Override
            void run() {
            }

            @Override
            void eat() {
            }

            @Override
            void sleep() {
            }
        };

        Animal a1 = new Bird("bird1") {
            @Override
            void fly() {

            }

            @Override
            void eat() {

            }

            @Override
            void sleep() {

            }
        };
        Animal a2 = new Lev("Leo");
        Animal a3 = new Mammal("mam2") {
            @Override
            void run() {

            }

            @Override
            void eat() {

            }

            @Override
            void sleep() {

            }
        };
        Animal a4 = new Pingvin("ping");
        Animal a5 = new Fish("Fish") {
            @Override
            void swim() {

            }

            @Override
            void eat() {

            }
        };
        Animal a6 = new Mechenosec("Metch");


        Speakable[] speakables = {s1, s2, s3};
        Animal[] animals = {a1,a2,a3,a4,a5,a6};

        for(Speakable s:speakables){
            if(s instanceof Speakable){
                s.speak();

            }
        }
        for(Animal a:animals){
            if(a instanceof Animal){
                System.out.println(a.name);
                a.sleep();
                a.eat();

            }
        }


    }
}
