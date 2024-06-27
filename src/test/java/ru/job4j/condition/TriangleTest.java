package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TriangleTest {

    @Test
    void whenExist() {
        double ab = 3.0;
        double ac = 4.0;
        double bc = 5.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

    @Test
    void whenNotExist() {
        double ab = 3.0;
        double ac = 4.0;
        double bc = 8.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isEqualTo(false);
    }
}