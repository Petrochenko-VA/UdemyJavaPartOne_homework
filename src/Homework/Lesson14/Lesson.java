package Homework.Lesson14;

public class Lesson {


     static void getTime(){
       HOUER: for(int hour=0; hour<=5; hour++){
            MINUTE:for(int minut=0; minut<=59; minut++){
                if((hour > 1)&&(minut%10==0)){
                    break HOUER;
                }
                SECONDS: for(int second=0; second<=59;second++){

                    if(second*hour>minut){
                        continue MINUTE;
                    }
                    System.out.println(hour+":"+minut+":"+second);
                }
            }
        }
    }

    public static void main(String[] args) {

        getTime();

    }
}

