package task_03.longest_series;

import task_03.MatrixUtils;

public class SortByLongestSeriesInMatrix {
    public static double getLongestSeriesInArray(int[] array) {
        int longestSeries = 0;
        int i = 0;
        while (i < array.length) {
            int j = i;
            int temp = 0;
            while ((j < array.length) && (array[j]) == array[i]) {
                j++;
                temp++;
            }
            i = j;
            if (temp > longestSeries) {
                longestSeries = temp;
            }
        }
        return (double)longestSeries;
    }

    public static double[] getSeries(int[][] array) {
        double[] average = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            average[i] = getLongestSeriesInArray(array[i]);
        }
        return average;
    }

    public static void sortByLongestSeries(int[][] array) {
        MatrixUtils.sortWithAverage(array, getSeries(array));
    }
}

