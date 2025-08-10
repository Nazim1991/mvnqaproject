package ru.netology.services;

public class FreelanceService {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int restMonths = 0; // счетчик месяцев отдыха
        int money = 0;     // текущее количество денег на счету

        // Цикл по 12 месяцам года
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                // Решил отдыхать
                money -= expenses;       // обязательные траты
                money /= 3;              // траты на отдых (делим на 3)
                restMonths++;            // увеличиваем счетчик отдыха
            } else {
                // Решил работать
                money += income;         // доход от работы
                money -= expenses;       // обязательные траты
            }
        }

        return restMonths;
    }
}