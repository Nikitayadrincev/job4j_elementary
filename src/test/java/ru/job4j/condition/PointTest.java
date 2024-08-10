package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when100200to20then222Dot71() {
        double expected = 222.71;
        Point a = new Point(100, 200);
        Point b = new Point(2, 0);
        double output = a.distance(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void whenMinus1000Minus200to1000800then2236Dot06() {
        double expected = 2236.06;
        Point a = new Point(-1000, -200);
        Point b = new Point(1000, 800);
        double output = a.distance(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when01to100101then141Dot42() {
        double expected = 141.42;
        Point a = new Point(0, 1);
        Point b = new Point(100, 101);
        double output = a.distance(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when024to4105then9() {
        double expected = 9;
        Point a = new Point(0, 2, 4);
        Point b = new Point(4, 10, 5);
        double output = a.distance3d(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when000to101010then17Dot321() {
        double expected = 17.321;
        Point a = new Point(0, 0, 0);
        Point b = new Point(10, 10, 10);
        double output = a.distance3d(b);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }
}