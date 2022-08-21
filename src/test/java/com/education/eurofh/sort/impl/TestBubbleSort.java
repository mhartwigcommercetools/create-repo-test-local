package com.education.eurofh.sort.impl;

import com.education.eurofh.sort.api.IntArraySorter;
import junit.framework.TestCase;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

@RunWith(JUnitParamsRunner.class)
public class TestBubbleSort extends TestCase {

    public TestBubbleSort() {}

    private IntArraySorter myIntArraySorter;

    @Before
    public void before() {
        myIntArraySorter = new BubbleSort();
    }

    @After
    public void after() {
        myIntArraySorter = null;
    }

    @Test
    @Parameters({
            "1               ,   1",
            "9-9             ,   9-9",
            "9-7             ,   7-9",
            "0-0-0-0         ,   0-0-0-0",
            "0-0-4-0         ,   0-0-0-4",
            "1-2-3-4-5-6     ,   1-2-3-4-5-6",
            "112-110-99      ,   99-110-112",
            "9-88-5-887-45   ,   5-9-45-88-887"
    })
    public void testSort(String unsorted, String sorted) {
        int[] unSortedArray =
                Arrays.stream(unsorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        int[] sortedArray =
                Arrays.stream(sorted.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        myIntArraySorter.sort(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }

    @Test
    public void testSort_emptyArray() {
        int[] unSortedArray = {};
        int[] sortedArray = {};
        myIntArraySorter.sort(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }


}
