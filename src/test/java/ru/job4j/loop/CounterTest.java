package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void sumFrom0to10result55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom3to8result33() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom1to1result1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom3to1result0() {
        int start = 3;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom3to5result12() {
        int start = 3;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 12;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom0to5result15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(expected).isEqualTo(result);
    }
}