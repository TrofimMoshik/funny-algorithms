package ru.moshik.tm.algorithm;

/**
 * Given an array of integers arr, return true if and only if it is a valid mountain array.
 *
 * Recall that arr is a mountain array if and only if:
 *
 * arr.length >= 3
 * There exists some i with 0 < i < arr.length - 1 such that:
 * arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
 * arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
 *
 */
public class MountainArray {
    public static void main(String[] args) {

        int[] arr1 = {0,1,2,1,2};
        int[] arr2 = {3,5,5};
        int[] arr3 = {0,3,2,1};
        int[] arr4 = {4,4,3,2,1};

        boolean result = validMountainArray(arr1);

        System.out.println(result);

    }

    public static boolean validMountainArray(int[] arr) {
        if (arr.length < 3) return false;

        int peak = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] <= arr[i-1]) {
                if (i == 1) {
                    return false;
                }
                peak = i - 1;
                break;
            }

            if (i == arr.length-1) {
                return false;
            }
        }

        for (int j = peak; j < arr.length-1; j++) {

            if (arr[j] <= arr[j+1]) {
                return false;
            }

        }

        return true;
    }
}