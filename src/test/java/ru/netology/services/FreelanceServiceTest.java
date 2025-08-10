package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FreelanceServiceTest {

    @Test
    public void testCalculateRestMonthsCase1() {
        FreelanceService service = new FreelanceService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;
        int restMonths = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, restMonths);
    }

    @Test
    public void testCalculateRestMonthsCase2() {
        FreelanceService service = new FreelanceService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;
        int restMonths = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, restMonths);
    }
}