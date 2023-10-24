package Homework.Lesson6;

public class Lesson6 {
    int sum(){

        System.out.println("0");
        return 0;
    }
    int sum(int a){

        System.out.println(a);
        return (a);

    }
    int sum(int a, int b){

        System.out.println(a+b);
        return (a+b);

    }
    int sum(int a, int b, int c){

        System.out.println(a+b+c);
        return (a+b+c);
    }
    int sum(int a, int b, int c, int d){

        System.out.println(a+b+c+d);
        return (a+b+c+d);
    }
    int sum(int a, int b, int c, int d, int e){

        System.out.println(a+b+c+d+e);
        return a+b+c+d+e;
    }
}

class Lesson6Test{
    public static void main(String[] args) {
        Lesson6 l0 = new Lesson6();
        l0.sum();
        l0.sum(1);
        l0.sum(1,1);
        l0.sum(1,1,1);
        l0.sum(1,1,1,1);


    }
}
