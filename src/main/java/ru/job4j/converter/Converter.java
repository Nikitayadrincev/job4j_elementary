package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 70;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 60;
        return result;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(2000);
        float dollar = rubleToDollar(2000);
        System.out.println("2000 rubles are " + euro + " euro.");
        System.out.println("2000 rubles are " + dollar + " dollar.");
    }
}
