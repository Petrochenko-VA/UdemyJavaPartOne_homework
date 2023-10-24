package Homework.Lesson9;

public class EightObject {
    int a;
    EightObject(int a){
        this.a = a;
    }
    public static void main(String[] args) {

        EightObject e1 = new EightObject(1);
        EightObject e2 = new EightObject(2);
        EightObject e3 = new EightObject(3);
        EightObject e4 = new EightObject(4);
        EightObject e5 = new EightObject(5);
        EightObject e6 = new EightObject(6);
        e1=null;
        e2=null;
        e3=null;
        e4=null;
        e5=null;
        e6=null;
        EightObject e7 = new EightObject(7);
        EightObject e8 = new EightObject(8);

        System.out.println(e1.a);
        System.out.println(e2.a);
        System.out.println(e3.a);
        System.out.println(e4.a);
        System.out.println(e5.a);
        System.out.println(e6.a);
        System.out.println(e7.a);
        System.out.println(e8.a);



    }
}
