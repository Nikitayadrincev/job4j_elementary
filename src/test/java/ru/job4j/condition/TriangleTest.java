package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenExist() {
        double ab = 10;
        double ac = 10;
        double bc = 30;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isFalse();
    }

    @Test
    void whenNotExist() {
        double ab = 10;
        double ac = 10;
        double bc = 10;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }
}