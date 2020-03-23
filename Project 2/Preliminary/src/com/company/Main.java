package com.company;

public class Main {

    double Mmin = 0, Mmax = 10;
    double mumin = 0, mumax = 0.5;

    int g = 10;
    int Fmin = -300, Fmax = 300;


    public static void main(String[] args) {

        experiment();
    }

    private static void experiment(){
        double[] F = {1, 20, 300};
        double[] t = {0, 1, 3};
        double M1 = 1, mu1 = 0;
        double M2 = 3, mu2 = 0.2;
        double M3 = 5, mu3 = 0.5;
        double M = M1 + M2 + M3;
        // Mg + F1(շփ) + F + N = Ma1
        // M2g + F2(շփ) + t2 + N2 = M2a2
        // M3g + F3(շփ) + t3 = M3a3
    }
}
