package task_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class NegativesThanPositivesSort {
    public static void main(String[] args) {
        //Our data for testing
        int[] array = {1, 4, 6, 2, -10, -15, 5, -18};

        //Output data before sorting
        System.out.println(Arrays.toString(array));

        //Sorting data
        sort(array);

        System.out.println("\n");

        //Output sorting data
        System.out.println(Arrays.toString(array));
    }


    public static void sort(int[] array) {
        List<Integer> negatives = new ArrayList<>();
        List<Integer> positives = new ArrayList<>();

        for (int number :
                array) {
            if (number < 0) {
                negatives.add(number);
            } else {
                positives.add(number);
            }
        }
        //Sorting our negative numbers in natural order
        negatives.sort(Comparator.naturalOrder());

        //Sorting our positive numbers in reverse order
        positives.sort(Comparator.reverseOrder());

        int temp = 0;
        for (int number :
                negatives) {
            array[temp] = number;
            temp++;
        }
        for (int number :
                positives) {
            array[temp] = number;
            temp++;
        }
    }
}
