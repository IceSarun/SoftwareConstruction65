package com.example;

public class Numeric {
    public int oddOrPos(int[] x) {
        int count = 0;
        for (int i = 0; i < x.length; i++) {
            if ((x[i]%2 == 1 || x[i]%2 ==-1) || x[i] > 0) {
                count++;
            }
        }
        return count;
    }


}
