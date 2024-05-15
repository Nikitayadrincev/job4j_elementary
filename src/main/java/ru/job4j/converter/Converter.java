package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return  value / 70;

    }

    public static float rubleToDollar(float value) {
        return  value / 60;
    }

    public static void main(String[] args) {
        float euro = rubleToEuro(2000);
        float dollar = rubleToDollar(2000);
        System.out.println("2000 rubles are " + euro + " euro.");
        System.out.println("2000 rubles are " + dollar + " dollar.");
    }
}
