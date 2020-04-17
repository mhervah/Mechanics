package com.company;

public class Main {

    double Mmin = 0, Mmax = 10;
    double mumin = 0, mumax = 0.5;

    static int g = 10;
    static int Fmin = -300, Fmax = 300;

    static double external_force = 0;

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


        double a2 = computeAcc1(M1, M2, M3, F[0], F[1], F[2], g, external_force);
        double a = computeAcc2(a2, M1, M2, F[0], F[1], g);
    }

    private static double computeAcc2(double a2,double m1,double m2,double f1,double f2,int g){
        return (-1*m2*a2 + f2*m2*g - f1*m1*g + f1*m2*a2 + f1*f2*m2*g)/(m1+m2);
    }

    private static double computeAcc1(double m1,double m2,double m3,double f1,double f2,double f3,int g,double external_force){
        return  (-1*(m1+m3)*(f2*m2*g - m3*g + 2*f3*external_force) + m3*(f2*m2*g - f1*m1*g + f1*f2*m2*g))/(m2*(m1+m3) - m3*(-1*m2 + f1*m2 - m1 - m3));
    }
}
