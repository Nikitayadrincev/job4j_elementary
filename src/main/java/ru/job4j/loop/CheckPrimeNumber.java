package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        for (int i = number - 1; i > 1; i--) {
            if (number % i == 0) {
                prime = false;
                break;
            } else {
                prime = true;
            }
        }
        return prime;
    }
}
