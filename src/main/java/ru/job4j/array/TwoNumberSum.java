package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int pointLeft = 0;
        int pointRight = array.length - 1;
        while (pointLeft < pointRight) {
            if (array[pointLeft] + array[pointRight] == target) {
                return new int[] {pointLeft, pointRight};
            } else if (array[pointLeft] + array[pointRight] < target) {
                pointLeft++;
            } else {
                pointRight--;
            }
        }
        return new int[0];
    }
}
