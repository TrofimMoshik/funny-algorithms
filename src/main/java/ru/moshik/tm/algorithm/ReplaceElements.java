package ru.moshik.tm.algorithm;


import java.util.Arrays;

/**
 *Given an array arr, replace every element in that array with the greatest element among the elements to its right,
 * and replace the last element with -1.
 *
 * After doing so, return the array.
 *
 */
public class ReplaceElements {

    public static int[] replaceElements(int[] arr) {

        int current = 0;

        while (current < arr.length-1) {
            int max = arr[arr.length-1];
            int i = arr.length - 1;
            while (i > current) {
                if (arr[i] > max) {
                    max = arr[i];
                }
                i--;
            }
            arr[current] = max;
            current++;
        }

        arr[arr.length-1] = -1;

        return arr;
    }

}