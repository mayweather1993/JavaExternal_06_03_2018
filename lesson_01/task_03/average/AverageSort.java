package task_03.average;

import static task_03.MatrixUtils.getAverage;

public class AverageSort {
    public static void sort(int[][] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array[i].length - 1; ++j) {
                for (int k = 1; k < array[i].length; ++k) {

                    if (getAverage(array, k - 1) < getAverage(array, k)) {
                        for (int l = 0; l < array.length; ++l) {
                            int tmp = array[l][k];
                            array[l][k] = array[l][k - 1];
                            array[l][k - 1] = tmp;
                        }
                    }
                }
            }
        }
    }
}
