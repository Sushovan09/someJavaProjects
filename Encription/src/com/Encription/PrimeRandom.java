package com.Encription;

public class PrimeRandom {
    private static long randomPrimeNumber;
    public static long primeRandom(){
        do{
            long randomPrimeNumber = RandomNumber.random();             // creating random number
        }while(!(CheckPrime.checkPrimeNumber(randomPrimeNumber)));      // checking if the random is prime number
        return randomPrimeNumber;
    }

}
