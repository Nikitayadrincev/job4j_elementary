package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMaxMinus58to85then85() {
        int first = -58;
        int second = 85;
        int expected = 85;
        assertThat(Max.max(first, second)).isEqualTo(expected);
    }

    @Test
    void whenMax0to50to102then2() {
        int first = 0;
        int second = 50;
        int third = 10;
        int expected = 50;
        assertThat(Max.max(first, second, third)).isEqualTo(expected);
    }

    @Test
    void whenMax58toMinus85then85() {
        int first = 58;
        int second = -85;
        int third = 0;
        int forth = 100;
        int expected = 100;
        assertThat(Max.max(first, second, third, forth)).isEqualTo(expected);
    }
}