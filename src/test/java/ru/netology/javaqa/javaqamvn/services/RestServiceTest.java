package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RestServiceTest {
    @Test
    public void shouldCalcExact() {
        RestService service = new RestService();

        int expected = 3;
        int income = 10_000; // изначальная сумма
        int expenses = 3_000; // потраченная сумма
        int threshold = 20_000; // порог

        int actual = service.calcRestService(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }
}

