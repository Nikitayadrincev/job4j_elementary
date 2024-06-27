package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMaxMinus58to85then85() {
        int left = -58;
        int right = 85;
        int expected = 85;
        assertThat(Max.max(left, right)).isEqualTo(expected);
    }

    @Test
    void whenMax0to2then2() {
        int left = 0;
        int right = 2;
        int expected = 2;
        assertThat(Max.max(left, right)).isEqualTo(expected);
    }

    @Test
    void whenMax58toMinus85then85() {
        int left = 58;
        int right = -85;
        int expected = 58;
        assertThat(Max.max(left, right)).isEqualTo(expected);
    }

    @Test
    void whenMax0to0then0() {
        int left = 0;
        int right = 0;
        int expected = 0;
        assertThat(Max.max(left, right)).isEqualTo(expected);
    }
}