package com.education.eurofh.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSelect {

    public Integer select(ArrayList<Integer> unsorted, int place) {

        if (unsorted.size() == 1) return unsorted.get(0);

        Integer pivot = unsorted.get(0);
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> larger = new ArrayList<>();
        for (int i = 1; i < unsorted.size(); i++) {
            if (unsorted.get(i) <= pivot) smaller.add(unsorted.get(i));
            if (unsorted.get(i) > pivot) larger.add(unsorted.get(i));
        }

        if (smaller.size() >= place) return select(smaller, place);
        if (smaller.size() + 1 == place) return pivot;
        return select(larger, place-(smaller.size()+1));
    }

    public static void main(String[] args) {
        int[] unSortedArray = {1,2,4,6,8,3};
        ArrayList<Integer> unSortedArrayList = new ArrayList<>();
        for (int e : unSortedArray)
            unSortedArrayList.add(e);
        QuickSelect myQuickSelect = new QuickSelect();
        int result  = myQuickSelect.select(unSortedArrayList, 5);
        System.out.println("Result " + result);


    }
}
