package task_03.average_task;

import task_03.MatrixUtils;

import static task_03.MatrixUtils.sortWithAverage;

public class DescendingAverageSort {
    public static double[] calculateAverageInArray(int[][] array) {
        double[] average = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            average[i] = MatrixUtils.getAverage(array[i]);
        }
        return average;
    }



    public static void averageSort(int[][] array) {
        sortWithAverage(array, calculateAverageInArray(array));
    }
}
