package Homework.Lesson8;


public class Class1 {
    int a, b, c;

    static int multiplyTreeNumber(int a1, int b1, int c1){
        return a1*b1*c1;
    }
    static void divisionTwoNumber(int a2, int b2) {
        int z = a2 % b2;
        int y = a2 / b2;
        System.out.println("Частное от деления: " + y + " " + "Остаток от деления :" + z);
    }

}
class Class1Test{
    public static void main(String[] args) {
        System.out.println(Class1.multiplyTreeNumber(1,2,3));
        Class1.divisionTwoNumber(5,2);

        System.out.println(Class1.multiplyTreeNumber(2,2,2));
        Class1.divisionTwoNumber(5,2);
    }
}
