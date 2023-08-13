package org.example.model;
/*
Перечисление типов услуги
 */

public enum TypeOfService {
    /*
    Константы услуг в виде их перечисления со значенем title
     */
    DECLARATION("Декларация доходов и недвижимости", 10),
    CONSULTATION("Консультация", 5),
    VERIFICATION("Верификация документов", 15),
    REGISTRATION("Регистрация имущества", 17),
    PRETENSION("Составление досудебной претензии", 18);
    private final String title;

    private final int price;

    /*
        Конструктор
         */
    TypeOfService(String title, int price) {
        this.title = title;
        this.price = price;
    }
    /*
    Геттер для значения услуги
     */
    public String getTitle() {
        return title;
    }

    /*
    Геттер для цены услуги
     */
    public int getPrice() {
        return price;
    }
    /*
    Переопределенный метод toString() класса Object для строкового представления услуги
     */
    @Override
    public String toString() {
        return '\'' + title + '\'';
    }
}
