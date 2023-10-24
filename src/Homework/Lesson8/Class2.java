package Homework.Lesson8;

public class Class2 {
    public final static double pi = 3.1415;


    public double square(double r) {
        return pi * r * r;
    }

    public static double line(double r) {
        return 2 * pi * r;
    }


    public void printInfo(double r) {

        System.out.println("Площадь круга: " + square(r) + " " + "Длина окружности: " + line(r));
    }
}

class Test{
    public static void main(String[] args) {
        Class2 test = new Class2();
        test.square(23.43);
        test.line(43.45);
        test.printInfo(32);
    }
}

