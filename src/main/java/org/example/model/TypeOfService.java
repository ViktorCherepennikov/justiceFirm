package org.example.model;
/*
Перечисление типов услуги
 */

public enum TypeOfService {
    /*
    Константы услуг в виде их перечисления со значенем title
     */
    DECLARATION("Декларация доходов и недвижимости"),
    CONSULTATION("Консультация"),
    VERIFICATION("Верификация документов"),
    REGISTRATION("Регистрация имущества"),
    PRETENSION("Составление досудебной претензии");
    private String title;
    /*
    Конструктор
     */
    TypeOfService(String title) {
        this.title = title;
    }
    /*
    Геттер для значения услуги
     */
    public String getTitle() {
        return title;
    }
    /*
    Переопределенный метод toString() класса Object для строгового представления услуги
     */
    @Override
    public String toString() {
        return '\'' + title + '\'';
    }
}
