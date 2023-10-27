package Homework.Lesson15;

public class TimeDoWhile {
    static void getTimeDoWhile() {


        //outer - while loop
        //middle - do while loop
        //inner - while loop
        //interval 6 hours
        //if hour >1 and minute/10 == 0 -> end metod
        //second*hour>minute -> next minute

        int hour = 0;
        HOUR:
        while (hour < 6) {
            int minute = -1;

            MINUTE:
            do {
                minute++;
                if(hour > 1 && minute % 10 == 0){
                    break HOUR;
                }

                int second = 0;
                SECONDS:
                while (second <= 59) {
                    if (second * hour > minute) {
                        continue MINUTE;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;

                }


            } while (minute < 59);

            hour++;
        }

    }

    public static void main(String[] args) {
        getTimeDoWhile();
    }
}
