package com.education.eurofh.util;

public class OtherMaths {

    // Gefunden in https://www.geeksforgeeks.org/median-of-two-sorted-arrays/?ref=lbp
    // verändert

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

    public static void primeFactors(int n) {
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i+= 2) {
            while (n%i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }
        if (n > 2)
            System.out.print(n);
    }
    /*
0,0,0,0,0,0
0,1,0,0,0,0
0,0,1,0,0,0
0,0,0,1,0,0
0,0,0,0,0,0
0,0,0,0,0,0
*/

}
