package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortSelectedTest {

    @Test
    public void whenSort34125Then12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3472591Then1234579() {
        int[] data = new int[] {3, 4, 7, 2, 5, 9, 1};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5, 7, 9};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort105Then015() {
        int[] data = new int[] {1, 0, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {0, 1, 5};
        assertThat(result).containsExactly(expected);
    }
}