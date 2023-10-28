package Homework.Lesson16;

public class EmailFilter {
    static void email(String email){

        String editEmail = email.substring(email.indexOf('@')+1, email.indexOf('.'));


        System.out.println(editEmail);
    }

    public static void main(String[] args) {
        email("ya@yahoo.com;");
        email("on@mail.ru;");
        email("ona@gmail.com;");
    }
}
