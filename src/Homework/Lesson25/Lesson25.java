package Homework.Lesson25;


import Homework.Lesson14.Lesson;

public class Lesson25 {
    public static void main(String[] args) {
        Animal a1 = new Lev("Leo");
        Animal a2 = new Pingvin("ping");
        Animal a3 = new Mechenosec("Metch");
        Fish f1 = new Mechenosec("metch");
        Bird b1 = new Pingvin("bird");
        Mammal m1 = new Lev("Lef");
        Mechenosec mech1 = new Mechenosec("mech");
        Pingvin p1 = new Pingvin("poingg");
        Lev l1 = new Lev("leo");

        Speakable s2 = new Pingvin("Ping");
        Speakable s1 = new Lev("LEF");


        Speakable[] speakables = {s1, s2, b1, m1, p1, l1};
        Animal[] animals = {a1, a2, a2, f1, b1, m1, mech1, p1, l1};

        for (Animal a : animals) {
            if (a instanceof Mechenosec) {
                Mechenosec m = (Mechenosec) a;
                System.out.println(m.name);
                m.eat();
                m.sleep();
                m.swim();
            } else if (a instanceof Pingvin) {
                Pingvin p = (Pingvin) a;
                System.out.println(p.name);
                p.eat();
                p.sleep();
                p.speak();
                p.fly();
            } else if (a instanceof Lev) {
                Lev l = (Lev) a;
                System.out.println(l.name);
                l.eat();
                l.run();
                l.sleep();
                l.speak();
            }
            System.out.println("--------------------");
        }

        for (Speakable s : speakables) {
            if (s instanceof Pingvin) {
                Pingvin p = (Pingvin) s;
                System.out.println(p.name);
                p.fly();
                p.speak();
                p.eat();
                p.sleep();

            } else if (s instanceof Lev) {
                Lev l = (Lev) s;
                System.out.println(l.name);
                l.speak();
                l.eat();
                l.run();
                l.sleep();

            }
        }

    }
}
