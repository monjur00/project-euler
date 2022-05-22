package net.projecteuler;

import java.io.IOException;

public class Euler235 {

    public static void main(String[] args) {

        int a = 900;
        int d = 3;
        int n = 5000;
        long s_n = -600000000000L;

        double lowerBound = 0;
        double upperBound = 10;

        double r = 0;
        while (upperBound - lowerBound > 0.00000000000001){
            r = (lowerBound+upperBound)/2;
            double sum = sum_n(r, n, a, d);

            if(sum > s_n)
                lowerBound = r;
            else
                upperBound = r;
        }

        System.out.println(r);

    }

    static double sum_n(double r, int n, int a, int b){
        double sum = 0L;

        double x = 1;
        for(int i = 1; i <= n; i++){
            sum += (a - b*i)*x;
            x *= r;
        }

        return sum;
    }
}

