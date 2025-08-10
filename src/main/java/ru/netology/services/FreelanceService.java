package ru.netology.services;

public class FreelanceService {

    public int calculate(int income, int expenses, int threshold) {
        int restMonths = 0;
        int money = 0;
        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) {
                money = money - expenses;
                int additionalExpenses = money - money / 3;
                money = money - additionalExpenses;
                System.out.println("Месяц " + month + ". Денег " + money + ". Буду отдыхать. Потратил -" + expenses + ", затем ещё -" + additionalExpenses);
                restMonths++;
            } else {
                System.out.println("Месяц " + month + ". Денег " + money + ". Придётся работать. Заработал +" + income + ", потратил -" + expenses);
                money = money + income - expenses;
            }
        }
        return restMonths;
    }
}