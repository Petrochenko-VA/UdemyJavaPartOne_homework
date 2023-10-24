package Homework.Lesson6;

public class StudentNew {
    //создание класса с состоянием
    int numberTicket;
    String name;
    String firstName;
    int yearEducation;
    public int averagePointMath;
    public int averagePointEconomic;
    public int averagePointEnglandLanguage;

    //создание конструктора
    StudentNew(int numberTicket1, String name1, String firstName1, int yearEducation1, int averagePointMath1, int averagePointEconomic1, int averagePointEnglandLanguage1){
        numberTicket=numberTicket1;
        name=name1;
        firstName=firstName1;
        yearEducation=yearEducation1;
        averagePointEconomic=averagePointEconomic1;
        averagePointMath=averagePointMath1;
        averagePointEnglandLanguage=averagePointEnglandLanguage1;
    }
    StudentNew(int numberTicket2,String name2, String firstName2, int yearEducation2){
        this(numberTicket2,name2,firstName2,yearEducation2,0,0,0);
    }
    public StudentNew(){
        int numberTicket;
        String name;
        String firstName;
        int yearEducation;
        int averagePointMath;
        int averagePointEconomic;
        int averagePointEnglandLanguage;
    }


    public int averageBall(int a, int b, int c){
        int averageBall = (a+b+c)/3;
        return averageBall;

    }

}

    class StudentTestNew{
        public static void main(String[] args) {

            //Создание экземпляров класса
            StudentNew st1 = new StudentNew(1,"Vladimir","Petrov", 2003);
            StudentNew st2 = new StudentNew(2,"Elena", "Ivanova",2003, 238,322,232);
            StudentNew st3 = new StudentNew();

            int sumAverage1 =  st1.averageBall(st1.averagePointMath,st1.averagePointEconomic,st1.averagePointEnglandLanguage);

            int sumAverage2 =  st2.averageBall(st2.averagePointMath, st2.averagePointEconomic, st2.averagePointEnglandLanguage);

            int sumAverage3 =  st3.averageBall(st3.averagePointMath,st3.averagePointEconomic,st3.averagePointEnglandLanguage);

            System.out.println("Student1: " + sumAverage1);
            System.out.println("Student2: " + sumAverage2);
            System.out.println("Student3: " + sumAverage3);
            System.out.println("Student1: " +  st1.numberTicket + " " + st1.name + " " +  st1.firstName + " " +  st1.yearEducation);
            System.out.println("Student2: " + st2.numberTicket + " " +  st2.name + " " +  st2.firstName + " " +  st2.yearEducation + " " +  st2.averagePointMath + " " +  st2.averagePointEconomic + " " +  st2.averagePointEnglandLanguage);
            System.out.println("Student3: " );


        }



    }

