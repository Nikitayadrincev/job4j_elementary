package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when100200to20then222Dot71() {
        double expected = 222.71;
        int x1 = 100;
        int y1 = 200;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void whenMinus1000Minus200to1000800then2236Dot06() {
        double expected = 2236.06;
        int x1 = -1000;
        int y1 = -200;
        int x2 = 1000;
        int y2 = 800;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    void when01to100101then141Dot42() {
        double expected = 141.42;
        int x1 = 0;
        int y1 = 1;
        int x2 = 100;
        int y2 = 101;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }
}