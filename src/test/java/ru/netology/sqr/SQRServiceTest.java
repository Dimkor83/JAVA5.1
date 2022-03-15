package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    public void shouldCalculate() {
        SQRService service = new SQRService();
//        int numberOccurence = 0;
        int i = 15;
        long expected = 3;

        long actual = service.main();

        assertEquals(expected, actual);

    }
}