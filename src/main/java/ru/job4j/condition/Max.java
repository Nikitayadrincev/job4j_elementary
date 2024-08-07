package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first >= second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        return first >= max(second, third) ? first : max(second, third);
    }

    public static int max(int first, int second, int third, int forth) {
        return first >= max(second, third, forth) ? first : max(second, third, forth);
    }

}