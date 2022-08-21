package com.education.eurofh.util;

public class DummyMaterialDevelopment {


    public void codeSmells() {

        int i = 10;

        if ((i > 0) && (i < 0)) {
            System.out.println("I cannot be reached.");
        }

        if (i > 5) {
            System.out.println("I will be executed and do not change i.");
        }

        if (i > 2) {
            System.out.println("Then I will also be executed.");
        }


    }
    public int power(int basis, int exponent) {
        if( exponent == 0)
            return 1;
        int temp = power(basis, exponent / 2);
        if (exponent % 2 == 0)
            return temp * temp;
        else
            return basis * temp * temp;
    }



    public int getMedian(int ar1[], int ar2[], int n) {
        int i = 0;
        int j = 0;
        int count;
        int m1 = -1, m2 = -1;

        for (count = 0; count <= n; count++) {
            if (i == n) {
                m1 = m2;
                m2 = ar2[0];
                break;
            }
            else if (j == n) {
                m1 = m2;
                m2 = ar1[0];
                break;
            }

            if (ar1[i] <= ar2[j]) {
                m1 = m2;
                m2 = ar1[i];
                i++;
            }
            else {
                m1 = m2;
                m2 = ar2[j];
                j++;
            }
        }

        return (m1 + m2)/2;
    }

    public int sum(int a, int b) {
        if (b == 0) return 0;
        return 1000;
    }

    public static void main(String[] args) {
        DummyMaterialDevelopment dummyMaterialDevelopment = new DummyMaterialDevelopment();
        int erg = dummyMaterialDevelopment.power(2,4);
        System.out.println("erg " + erg);

        int[] a1 = {5,8};
        int[] a2 = {7,8};
        int la = 2;
        int median = dummyMaterialDevelopment.getMedian(a1, a2, la);
        System.out.println("median " + median);

    }

}
