package com.education.eurofh.sort;

import com.education.eurofh.sort.api.IntArraySorter;
import com.education.eurofh.sort.impl.BubbleSort;

import java.util.Arrays;

public class DummyBubbleSort {

    public static void main(String[] args) {

        int[] myNumbers = {3,8,2,6,7,8,1,12,0,-5,7};
        System.out.println("Vor der Sortierung:" + Arrays.toString(myNumbers));
        new BubbleSort().sort(myNumbers);
        System.out.println("Nach der Sortierung:" + Arrays.toString(myNumbers));
    }

}
