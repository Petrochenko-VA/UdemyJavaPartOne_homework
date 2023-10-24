package Homework.Lesson13;

public class Year {
}
//Вывод на экран количества дней по номеру месяца для 2023 года
class Month{
    public final void otputAmountDay(int numMouth){
        switch (numMouth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("В этом месяце 31 день");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("В этом месяце 30 дней");
                break;
            case 2:
                System.out.println("В этом месяце 28 дней и это февраль ;)");
                break;
        }
    }


    public static void main(String[] args) {
        Month m=new Month();
        m.otputAmountDay(5);
        m.otputAmountDay(10);
        m.otputAmountDay(6);
        m.otputAmountDay(11);
        m.otputAmountDay(2);


    }
}
