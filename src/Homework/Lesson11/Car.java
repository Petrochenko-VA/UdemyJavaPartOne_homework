package Homework.Lesson11;

import Homework.Lesson10.p1.p2.p3.C;

public class Car {
    String color;
    String engine;
     int quantyDoors;

     Car(String color, String engine, int quantyDoors){
         this.color=color;
         this.engine=engine;
         this.quantyDoors = quantyDoors;
     }
}
class CarTest{
    static void changeQuantyDoors(Car car, int quantyDoors){
        car.quantyDoors=quantyDoors;
    }
    static void changeColor(Car car1, Car car2){
        String tempColor  = car1.color;
        car1.color = car2.color;
        car2.color = tempColor;
    }

    public static void main(String[] args) {
        CarTest ct = new CarTest();
        Car car = new Car("red","v4", 2);

        System.out.println(car.quantyDoors);
        ct.changeQuantyDoors(car, 5);
        System.out.println(car.quantyDoors);

        Car car1 = new Car("red", "v3", 5);
        Car car2 = new Car("blue", "v12", 56);

        System.out.println(car1.color);
        System.out.println(car2.color);
        changeColor(car1,car2);


        System.out.println(car1.color);
        System.out.println(car2.color);



    }
}