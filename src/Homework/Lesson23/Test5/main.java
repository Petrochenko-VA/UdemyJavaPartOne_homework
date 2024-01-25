package Homework.Lesson23.Test5;


class X {
    String s1 = "privet";

}
class Y extends X{
    boolean bool = false;
}
class Test{
    public static void main(String[] args) {
        X x = new Y();
        System.out.println(x.s1);
      //  System.out.println(x.bool);
    }
}
