package com.education.eurofh.util;

import java.math.BigInteger;

public class BinarySearch {

    public boolean search(int[] A, int start, int end, int e) {

        if (A.length == 0) return false;
        if (A.length == 1) return (A[0] == e);
        if (start > end) return false;
        if (start == end) return (A[start] == e);

        int pivot = start + ((end - start) / 2);
        if (e == A[pivot]) return true;
        if (e < A[pivot])
            return search(A, start, pivot-1, e);
        else
            return search(A, pivot+1, end, e);

    }

    public static void main(String[] args) {

        BinarySearch binarySearch = new BinarySearch();
        int[] A = {2,4,7,11,31,32,44,45,99,1912,2202,2202,2206};
        int exists = 11;
        int notExists = 23;

        System.out.println("Die Zahl " + exists + " ist im Array " +
                binarySearch.search(A, 0, A.length-1, exists));
        System.out.println("Die Zahl " + notExists + " ist im Array " +
                binarySearch.search(A, 0, A.length-1, notExists));


    }
}
