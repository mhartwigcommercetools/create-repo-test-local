package com.education.eurofh.sort.impl;

import com.education.eurofh.sort.api.IntArraySorter;

public class BubbleSort implements IntArraySorter {

    public void swap (int[] A, int pos1, int pos2) {
        int temp = A[pos1];
        A[pos1] = A[pos2];
        A[pos2] = temp;
    }

    public void sort(int[] A) {
        for (int j = 0; j < A.length; j++)
            for (int i = 0; i < (A.length-1); i++)
                if (A[i] > A[i+1]) swap(A, i, i+1);
    }
    public int[] sortWithReturn(int[] A) {
        for (int j = 0; j < A.length; j++)
            for (int i = 0; i < (A.length-1); i++)
                if (A[i] > A[i+1]) swap(A, i, i+1);
                return A;
    }

}
