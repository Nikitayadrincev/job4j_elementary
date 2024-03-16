package ru.job4j.condition;

import static java.lang.Math.*;

public class TriangleArea {
    public static double area(double a, double b, double c) {
        double semiper = (a + b + c) / 2;
        double result = sqrt(semiper * (semiper - a) * (semiper - b) * (semiper - c));
        return result;
    }

    public static void main(String[] args) {
        double result = area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + result);
    }
}
