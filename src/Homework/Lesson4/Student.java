package Homework.Lesson4;

import Homework.Lesson6.StudentNew;

public class Student {
    //создание класса с состоянием
    int numberTicket;
    String name;
    String firstName;
    int yearEducation;
    int averagePointMath;
    int averagePointEconomic;
    int averagePointEnglandLanguage;

    int averageBall (int a, int b, int c){
        int averageBall = (a+b+c)/3;
        return averageBall;

    }

}

    class StudentTest{
        public static void main(String[] args) {

            //Создание экземпляров класса
            StudentNew st1 = new StudentNew();
            StudentNew st2 = new StudentNew();
            StudentNew st3 = new StudentNew();

            //присвоение данных экземплярам класса и вычисление среднего

            st1.averagePointMath = 1;
            st1.averagePointEconomic = 2;
            st1.averagePointEnglandLanguage = 3;

            int sumAverage1 =  st1.averageBall(st1.averagePointMath,st1.averagePointEconomic,st1.averagePointEnglandLanguage);

            st2.averagePointMath = 1;
            st2.averagePointEconomic = 1;
            st2.averagePointEnglandLanguage = 1;

            int sumAverage2 =  st2.averageBall(st2.averagePointMath, st2.averagePointEconomic, st2.averagePointEnglandLanguage);


            st3.averagePointMath = 3;
            st3.averagePointEconomic = 3;
            st3.averagePointEnglandLanguage = 3;

            int sumAverage3 =  st3.averageBall(st3.averagePointMath,st3.averagePointEconomic,st3.averagePointEnglandLanguage);

            System.out.println("Student1: " + sumAverage1);
            System.out.println("Student2: " + sumAverage2);
            System.out.println("Student3: " + sumAverage3);


        }



    }

