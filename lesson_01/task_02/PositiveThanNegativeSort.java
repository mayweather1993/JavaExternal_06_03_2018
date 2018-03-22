package task_02;

import java.util.Arrays;

public class PositiveThanNegativeSort {
    public static void main(String[] args) {
        int[] array = {-5,  9, -1, -2 , 3 , -9};



        System.out.println("=======================");
        System.out.println("Our data before sorting");
        System.out.println("=======================");
        System.out.println(Arrays.toString(array));

        //Sorting data
        sort(array);

        System.out.println("\n");

        System.out.println("======================");
        System.out.println("Our data after sorting");
        System.out.println("======================");
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int i = 0, j = array.length - 1;
        while (i != j) {
            while ((i != j) && (array[i] > 0)) i++;
            while ((i != j) && (array[j] < 0)) j--;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}