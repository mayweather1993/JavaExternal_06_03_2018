package task_02;

import java.util.Arrays;

public class PositiveThanNegativeSort {
    public static void main(String[] args) {
        //Our data for testing
        int[] array = {1, 4, 2, -5, -3, 9, -1, 10};

        //Output data before sorting
        System.out.println(Arrays.toString(array));

        //Sorting data
        sort(array);

        System.out.println("\n");

        //Output sorting data
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        int i = 0;
        int j = array.length - 1;
        while (i <= j) {
            while (array[i] < 0) i++;
            while (array[j] >= 0) j--;
            if (i <= j) {
                swap(array, i, j);
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
}