package ru.job4j.converter;

public class Converter  {
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
        float inputEuro = 140;
        float inputDollar = 120;
        float expectedEuro = 2;
        float expectedDollar = 2;
        float outputEuro = rubleToEuro(inputEuro);
        float outputDollar = rubleToDollar(inputDollar);
        boolean passedEuro = expectedEuro == outputEuro;
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("140 rubles are 2. Test result : " + passedEuro);
        System.out.println("120 rubles are 2. Test result : " + passedDollar);
    }
}
