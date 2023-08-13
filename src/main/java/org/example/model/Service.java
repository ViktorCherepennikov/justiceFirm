package org.example.model;

import java.util.List;

/*
Класс услуги
 */
public class Service {
    /*
    Поля класса
     */
    private int id;
    private TypeOfService typeOfService;
    /*
    Конструктор
     */
    public Service(TypeOfService typeOfService) {
        this.typeOfService = typeOfService;
    }
    /*
    Геттеры и сеттеры для всех полей класса кроме id
     */
    public int getPrice() {
        return typeOfService.getPrice();
    }
    public void setTypeOfService(TypeOfService typeOfService) {
        this.typeOfService = typeOfService;
    }
    public TypeOfService getTypeOfService() {
        return typeOfService;
    }

    @Override
    public String toString() {
        return "               " + typeOfService.getTitle() + ";";
    }
}
