package ru.netology.services;

public class main {
    public static void main(String[] args) {
        FreelanceService service = new FreelanceService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int answer = service.calculate(income, expenses, threshold);
        System.out.println(answer);




    }
}