package Homework.Lesson28;

public class Class27 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();

        tiger.eat("myaso");

        try {
            tiger.drink("voda");

            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e);

            }
            finally {
                System.out.println("Ento inner finaly block");
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
