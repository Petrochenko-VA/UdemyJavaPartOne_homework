package Homework.Lesson18;

public class PrintArray {

    static void printArray(String[][] array) {
        char a = '"';
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("{");
            for (int j = 0; j < array[i].length; j++) {
                if (j < array[i].length - 1) {
                    System.out.print(a + array[i][j] + a + ",");
                } else {
                    System.out.print(a + array[i][j] + a);
                }
            }
            if (i < array.length - 1) {
                System.out.print("},");
            } else {
                System.out.print("}");
            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        String[][] testArr = new String[][]{{"element1", "element2", "element3"}, {"element11", "element12"}, {"element21", "element22", "element23"}, {"element31"}};
        printArray(testArr);
    }
}