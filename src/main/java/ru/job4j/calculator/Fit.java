package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - 100) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightMan = 187;
        short heightWoman = 165;
        double man = manWeight(heightMan);
        System.out.println("Man 187 is " + man);
        double woman = womanWeight(heightWoman);
        System.out.println("Woman 165 is " + woman);
    }
}
