package ru.netology.esaukova.hw5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationCalculatorServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacation.csv")

    public void testVacationCalc(int expected, int income, int expenses, int threshold) {

        VacationCalculatorService service = new VacationCalculatorService();

        // income = 10_000 доход
        // expenses = 3_000 расход
        // threshold = 20_000 лимит на счету, чтобы взять отпуск

        //int expected = 3;
        int actual = service.calculateVacation(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);

    }

    // @Test
    //public void testVacationCalcHighIncome() {
    // VacationCalculatorService service = new VacationCalculatorService();
    // income = 100_000 доход
    // expenses = 60_000 расход
    // threshold = 150_000 лимит на счету, чтобы взять отпуск
    // int expected = 2;
    // int actual = service.calculateVacation(100_000, 60_000, 150_000);
    // Assertions.assertEquals(expected, actual);
    //}


}
