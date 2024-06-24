package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    @DisplayName("Test with p=6 and k=2, expecting area=2")
    void whenP6K2then2() {
        double expected = 2;
        double p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    @DisplayName("Test with p=220 and k=48, expecting area=241,89")
    void whenP220K48then241Dot89() {
        double expected = 241.89;
        double p = 220;
        double k = 48;
        double output = RectangleArea.square(p, k);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }

    @Test
    @DisplayName("Test with p=10000 and k=4300, expecting area=5811,25")
    void whenP10000K4300then5811Dot25() {
        double expected = 5811.25;
        double p = 10000;
        double k = 4300;
        double output = RectangleArea.square(p, k);
        assertThat(expected).isEqualTo(output, withPrecision(0.01));
    }
}