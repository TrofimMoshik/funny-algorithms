package ru.moshik.tm.algorithm;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        int[] arr = {-2,0,10,-19,4,6,-8};
        HashSet<Integer> set = new HashSet<>();
        boolean answer = false;
        for (int i = 0; i < arr.length; i++) {

            if (set.contains(2*arr[i]) || (arr[i] % 2 == 0 && set.contains(arr[i]/2))) {
                answer = true;
            }
            set.add(arr[i]);
        }

        System.out.println(answer);

    }
}