package com.musingscafe.dsa.array;

public class Algos {

    public static int binarySearch(int[] array, int value) {
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while (left <= right) {
            mid = left + (right - left) / 2;

            if (array[mid] == value) {
                return mid;
            }

            if (array[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
