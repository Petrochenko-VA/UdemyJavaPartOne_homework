package Homework.Lesson28;

import java.io.*;

public class Tiger {

    void eat(String paramEat) throws NeMyasoException {
        if (paramEat != "myaso") {
            throw new NeMyasoException("Тигр не ест " + paramEat);
        }else{
            System.out.println("Тигр ест " + paramEat);
        }
    }

    void drink(String paramVoda) throws NeVodaException {
        if (paramVoda != "voda") {
            throw new NeMyasoException("Тигр не пьет " + paramVoda);
        }else{
            System.out.println("Тигр пьет " + paramVoda);
        }

    }

}


