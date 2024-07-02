package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void sumFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int result = Counter.sum(start, finish);
        int expected = 55;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom3To8Then33() {
        int start = 3;
        int finish = 8;
        int result = Counter.sum(start, finish);
        int expected = 33;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom1To1Then1() {
        int start = 1;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 1;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom3To1Then0() {
        int start = 3;
        int finish = 1;
        int result = Counter.sum(start, finish);
        int expected = 0;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom3To5Then12() {
        int start = 3;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 12;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void sumFrom0To5Then15() {
        int start = 0;
        int finish = 5;
        int result = Counter.sum(start, finish);
        int expected = 15;
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void whenSumEvenNumbersFrom1To10Then30() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinus2To10Then28() {
        int start = -2;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 28;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom10To14Then36() {
        int start = 10;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 36;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom0ToMinus10Then0() {
        int start = 0;
        int finish = -10;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFrom0To14Then56() {
        int start = 0;
        int finish = 14;
        int result = Counter.sumByEven(start, finish);
        int expected = 56;
        assertThat(result).isEqualTo(expected);
    }
}