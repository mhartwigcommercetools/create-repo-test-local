package com.education.eurofh.util;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import com.education.eurofh.util.Euklid;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(JUnitParamsRunner.class)
public class TestBinarySearch {

    private BinarySearch binarySearch;

    @Before
    public void before() {
        binarySearch = new BinarySearch();
    }

    @After
    public void after() {
        binarySearch = null;
    }

    @Test
    @Parameters({
            "18               ,   18         , true",
            "18               ,   88         , false",
            "9-9-9-9-9        ,   9          , true",
            "9-9-9-9-9        ,   908        , false",
            "1-2-3-4-5-6      ,   6          , true",
            "1-2-3-4-5-6      ,   5          , true",
            "1-2-3-4-5-6      ,   9          , false",
            "1-2-3-4-5-6      ,   1          , true"
    })
    public void search(String myList, int numberToBeSearched, boolean found) {
        int[] sortedArray =
                Arrays.stream(myList.split("-"))
                        .map(Integer::valueOf)
                        .mapToInt(Integer::intValue)
                        .toArray();
        assertEquals(found,
                        binarySearch.search(sortedArray, 0, sortedArray.length-1, numberToBeSearched));
    }


}
