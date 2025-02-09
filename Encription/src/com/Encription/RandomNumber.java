package com.Encription;

import java.lang.Math;

public class RandomNumber {
    private static long min = 10000000;                  //upper bound of the prime sequence
    private static long max = 99999999;                  //lower bound of the prime sequence

    public static long random() {
//Generate random int value from max to min
        long b = (long) (Math.random() * (max - min + 1) + min);
        return b;
    }
}
