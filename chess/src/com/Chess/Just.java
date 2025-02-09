package com.Chess;

public class Just {
    public static void main(String[] args) {
        int a=9,b=4,c=7,d=1,e=3;
        //  _>  true        false       *false      true        *true   *->this means the compiler does not evaluate those part of the statement
        while((a=1)==1 && (b=2)==3 && (c=3)==3 || (d=4)==4 || (e=5)==7){ //because they don't contribute about the output of the equation\statement
            System.out.println(a+" "+b+" "+c+" "+d+" "+e);
            break;
        }
    }
}
