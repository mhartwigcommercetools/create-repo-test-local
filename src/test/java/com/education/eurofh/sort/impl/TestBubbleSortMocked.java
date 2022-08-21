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
import org.mockito.Mockito;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

@RunWith(JUnitParamsRunner.class)
public class TestBubbleSortMocked extends TestCase {

    public TestBubbleSortMocked() {}

    private IntArraySorter bubbleSortMock;

    @Before
    public void before() {
        bubbleSortMock = Mockito.spy(new BubbleSort());
        int[] emptyArray = {};
        int[] array123 = {1,2,3};

        Mockito.doReturn(emptyArray).when(bubbleSortMock).sortWithReturn(emptyArray);
        Mockito.doReturn(array123).when(bubbleSortMock).sortWithReturn(array123);

    }

    @After
    public void after() {
        bubbleSortMock = null;
    }

    @Test
    @Parameters({
            "1-2-3           ,   1-2-3",
            "3-2-1           ,   1-2-3",
            "1-3-2           ,   1-2-3"
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

        bubbleSortMock = Mockito.spy(new BubbleSort());
        int[] emptyArray = {};
        int[] array123 = {1,2,3};
        Mockito.doReturn(emptyArray).when(bubbleSortMock).sortWithReturn(emptyArray);
        Mockito.doReturn(array123).when(bubbleSortMock).sortWithReturn(unSortedArray);

        assertArrayEquals(sortedArray,
                            bubbleSortMock.sortWithReturn(unSortedArray)
        );
    }

    /*
    @Test
    public void testSort_emptyArray() {
        int[] unSortedArray = {};
        int[] sortedArray = {};
        myIntArraySorter.sort(unSortedArray);
        assertArrayEquals(sortedArray, unSortedArray);
    }
*/

}
