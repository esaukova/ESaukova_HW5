package ru.netology.esaukova.hw5.services;
public class VacationCalculatorService {
    public int calculateVacation (int income, int expenses, int threshold) {
        int vacationMonthsCount = 0;
        int moneyOnAccount = 0;

        for (int month = 0; month < 12; month ++) {
            if (moneyOnAccount >= threshold) {
                vacationMonthsCount++;
                moneyOnAccount = (moneyOnAccount - expenses) / 3;
            } else {
                moneyOnAccount = moneyOnAccount + income - expenses;
            }
        }
        return vacationMonthsCount ;
    }
}
