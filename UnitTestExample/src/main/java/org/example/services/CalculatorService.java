package org.example.services;

public class CalculatorService {

    public static int addTwoNumbers(int a, int b){
        return a+b;
    }

    public static int productTwoNumbers(int a, int b){
        return a*b;
    }

    public static double divideTwoNumbers(int a, int b){
        return a/b;
    }

    // int ... numbers means we are providing 0 to any number of int values in comma separated form
    public static int sumAnyNumbers(int ...numbers){
        int s = 0;
        for(int n : numbers){
            s += n;
        }
        return s;
    }
}
