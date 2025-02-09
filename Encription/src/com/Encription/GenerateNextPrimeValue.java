package com.Encription;

public class GenerateNextPrimeValue {
    public static long nextPrime(long l, int n){
        long number = l;
        int i=0;
        while(i<n){
            if(CheckPrime.checkPrimeNumber(number)){
                l=number;
                i++;
            }
            number++;
        }
        return l;
    }
    public static long nextPrimeNeg(long l, int n){
        long number = l;
        int i=0;
        while(i<n){
            if(CheckPrime.checkPrimeNumber(number)){
                l=number;
                i++;
            }
            number--;
        }
        return l;
    }
}
