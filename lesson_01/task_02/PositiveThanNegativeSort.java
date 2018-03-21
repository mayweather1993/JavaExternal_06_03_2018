package task_02;

import java.util.Arrays;

public class PositiveThanNegativeSort {
    public static void main(String[] args) {
        int[] array = {-5, -3, 9, -1, -2 , 3 , -9};


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

    public static void sort(int[] arrayToSort) {
        int i = 0, j = arrayToSort.length - 1;
        while (i != j) {
            while ((i != j) && (arrayToSort[i] > 0)) i++;
            while ((i != j) && (arrayToSort[j] < 0)) j--;
            int temp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[j];
            arrayToSort[j] = temp;
        }
    }
}