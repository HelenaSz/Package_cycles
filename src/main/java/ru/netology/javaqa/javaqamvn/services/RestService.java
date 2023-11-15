package ru.netology.javaqa.javaqamvn.services;

public class RestService {

    public int calcRestService(int income, int expenses, int threshold) {
        int deposit = 0;
        int count = 0;

        for (int month = 1; month <= 12; month++) {
            if (deposit < threshold) {
                deposit = deposit + income - expenses;
            } else {
                deposit = (deposit - expenses) / 3; // отпуск состоится
                count++; // увеличиваем счётчик месяцев отдыха
            }
        }
        return count;
    }
}
