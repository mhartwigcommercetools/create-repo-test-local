package com.education.eurofh.util;

public class Euklid {

    public int greatestCommonDevisor(int a, int b) throws NoPositiveIntegerException {

        if (a < 1 || b < 1)
            throw new NoPositiveIntegerException("Number not positive.");

        while (a != b) {
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            b = b - a;
        }
        return a;
    }

    public static void main(String[] args) {
        Euklid euklid = new Euklid();
        // System.out.println(euklid.greatestCommonDevisor(0,5));
    }

}
