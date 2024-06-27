package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
            return (ab + ac > bc) && (ac + bc > ab) && (ab + bc > ac);
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(3, 4, 5));
        System.out.println(Triangle.exist(0, 2, 5));
        System.out.println(Triangle.exist(3, 4, 8));
    }
}
