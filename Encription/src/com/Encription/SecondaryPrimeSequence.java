package com.Encription;

public class SecondaryPrimeSequence {
    public static int[] secPrimeSequence(int len){
        int arr[] = new int[len];
        int i=0, number=0;
        while(i<len){
            if(CheckPrime.checkPrimeNumber(number)){
                arr[i]=number;
                i++;
            }
            number++;
        }
        return arr;
    }
}
