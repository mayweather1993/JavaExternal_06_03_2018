package task_03.average_task;

import task_03.MatrixUtils;

public class DescendingAverageSort {
    public static double[] calculateAverageInArray(int[][] array) {
        double[] average = new double[array.length];

        for (int i = 0; i < array.length; i++) {
            average[i] = MatrixUtils.getAverage(array[i]);
        }
        return average;
    }

    public static void sortWithAverage(int[][] array, double[] average) {
        for (int i = 0; i < average.length - 1; i++) {
            double min = average[i];
            int index = i;
            for (int j = i; j < average.length; j++) {
                if (average[j] < min) {
                    min = average[j];
                    index = j;
                }
            }
            if (index != i) {
                MatrixUtils.swap(average, i, index);
                MatrixUtils.swapRow(array, i, index);
            }
        }
    }

    public static void averageSort(int[][] array) {
        sortWithAverage(array, calculateAverageInArray(array));
    }
}
