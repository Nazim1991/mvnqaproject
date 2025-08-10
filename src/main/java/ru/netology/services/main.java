package ru.netology.services;

public class main {
    public static void main(String[] args) {
        FreelanceService service = new FreelanceService();

        // Пример 1 из задания
        int income1 = 10_000;
        int expenses1 = 3_000;
        int threshold1 = 20_000;
        int result1 = service.calculateRestMonths(income1, expenses1, threshold1);
        System.out.println("Пример 1:");
        System.out.println("Доход: " + income1 + ", траты: " + expenses1 + ", порог: " + threshold1);
        System.out.println("Месяцев отдыха: " + result1);
        System.out.println();


    }
}