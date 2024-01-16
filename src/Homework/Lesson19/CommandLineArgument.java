package Homework.Lesson19;

public class CommandLineArgument {
    public static void abc(String[]... array) {

        //всем элементам переданным в command line присвоить значение null
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }

        // вывести на экран значения обновленного массива
        for (String [] a : array) {
            System.out.println(a);
        }


        return ;
    }

    public static void main(String[] args) {
        abc(args);
    }

}

