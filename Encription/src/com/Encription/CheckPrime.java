package com.Encription;

public class CheckPrime {
    public static boolean checkPrimeNumber(long n){
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
    }

}
