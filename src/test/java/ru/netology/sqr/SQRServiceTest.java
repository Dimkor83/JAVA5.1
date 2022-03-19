package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value = "positiveTest,200,300,3")
    public void shouldCalculate(String testName, int lowerLimit, int upperLimit, long expected) {
        SQRService service = new SQRService();

        long actual = service.entry(lowerLimit, upperLimit);

        assertEquals(expected, actual);

    }
}