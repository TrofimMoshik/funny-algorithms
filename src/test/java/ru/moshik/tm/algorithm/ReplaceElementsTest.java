package ru.moshik.tm.algorithm;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class ReplaceElementsTest {

    private final int[] array1 = {17,18,5,4,6,1};
    private final int[] expected1 = {18,6,6,6,1,-1};
    private final int[] array2 = {3,5,5};
    private final int[] expected2 = {5,5,-1};
    private final int[] array3 = {0,3,2,1};
    private final int[] expected3 = {3,2,1,-1};
    private final int[] array4 = {4,4,3,2,1};
    private final int[] expected4 = {4,3,2,1,-1};

    @Test
    public void replaceElementsTestFirstSuit() {
        System.out.println(Arrays.toString(ReplaceElements.replaceElements(array4)));
        int[] actual = ReplaceElements.replaceElements(array1);
        Assert.assertArrayEquals(expected1, actual);
    }

}