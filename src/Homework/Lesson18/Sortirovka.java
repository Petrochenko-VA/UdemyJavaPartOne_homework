package Homework.Lesson18;

public class Sortirovka {
    public static int[] sortirovka(int[] array) {

        int a;
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            if (i != index) {
                a = array[i];
                array[i] = min;
                array[index] = a;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{3, 2, 9, -4,6,1,0,43,-99, 100};

        sortirovka(testArr);
        for(int i =0; i< testArr.length; i++)
            System.out.println(testArr[i]);
    }
}