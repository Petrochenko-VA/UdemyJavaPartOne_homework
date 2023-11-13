package Homework.Lesson18;

public class ArraySort {


    static int[] getSortArray(int[] arrays) {
        int [] arrayOut = new int[arrays.length];
        for(int i =0; i< arrays.length-1; i++){
            for(int j=0; j< arrays.length -1-i; j++){
                if(arrays[j]>arrays[j+1]){
                    int temp = arrays[j];
                    arrays[j] = arrays[j+1];
                    arrays[j+1]=temp;
                }
            }
        }
        for (int i = 0; i< arrays.length; i++){
            arrayOut[i] = arrays[i];
        }
        for (int i =0; i<arrayOut.length;i++){
            System.out.println(arrayOut[i]);
        }
        return arrayOut;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{3, 2, 9, -4,6,1,0,43,-99, 100};

        getSortArray(testArr);
    }
}
