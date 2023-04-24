package org.example.model;
/*
Перечисление типов услуги
 */

public enum TypeOfService {
    DECLARATION("Декларация доходов и недвижимости"),
    CONSULTATION("Консультация"),
    VERIFICATION("Верификация документов"),
    REGISTRATION("Регистрация имущества"),
    PRETENSION("Составление досудебной претензии");
    private String title;

    TypeOfService(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return '\'' + title + '\'';
    }
}
