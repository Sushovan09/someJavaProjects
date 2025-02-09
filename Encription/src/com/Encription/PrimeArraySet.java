package com.Encription;

public class PrimeArraySet {

    public static long[] primeArrSet(long l, long lengthString){
        int lengthOfArr= 128 * (int)Math.pow(2, Long.toString(lengthString).length());   //calculating the size of the arr dynamically like 2^(1) for one digit number(0to9)
        int[] primeSequenceArray = SecondaryPrimeSequence.secPrimeSequence(lengthOfArr);
        long[] primeSequenceArrayMain = new long[lengthOfArr];
        int i=0, primeCounter1=0, primeCounter2=0, primeCounter3=0, primeCounter4=0;

        while (i < 2) {
            if(i/2==0){
                primeCounter1= primeSequenceArray[i];
                primeSequenceArrayMain[i]= GenerateNextPrimeValue.nextPrime(l,primeCounter1);
            }
            else{
                primeCounter3= primeSequenceArray[i];
                primeSequenceArrayMain[i]= GenerateNextPrimeValue.nextPrimeNeg(l,primeCounter3);
            }
            i++;
        }
        while(i<lengthOfArr){
            if(i/2==0){
                primeCounter1= primeSequenceArray[i];
                primeCounter2= primeSequenceArray[i-2];
                primeSequenceArrayMain[i]= GenerateNextPrimeValue.nextPrime(primeSequenceArrayMain[i-2],primeCounter1-primeCounter2);
            }
            else{
                primeCounter3= primeSequenceArray[i];
                primeCounter4= primeSequenceArray[i-2];
                primeSequenceArrayMain[i]= GenerateNextPrimeValue.nextPrimeNeg(primeSequenceArrayMain[i-2],primeCounter3-primeCounter4);
            }
            i++;
        }
        return primeSequenceArrayMain;
    }

}
