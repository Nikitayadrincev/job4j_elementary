package ru.job4j.condition;

import static java.lang.Math.*;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double semiPer = (a + b + c) / 2;
        return sqrt(semiPer * (semiPer - a) * (semiPer - b) * (semiPer - c));
    }

    public static void main(String[] args) {
        double result = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
