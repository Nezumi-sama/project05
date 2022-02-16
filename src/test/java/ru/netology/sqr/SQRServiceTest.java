package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = {"200, 300, 3", "2000, 3000, 10", "5050, 9000, 23", "480, 4848, 48", "50, 10000, 90"})
    void shouldCalculateCountSquaresInRange(int start, int end, int expected) {
        SQRService square = new SQRService();

        int result = square.countSquaresInRange(start, end);

        assertEquals(expected, result);

    }
}