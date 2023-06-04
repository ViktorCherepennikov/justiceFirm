package org.example.model;

import java.util.List;

/*
Класс услуги
 */
public class Service{
    /*
    Поля класса
     */
    private int id;
    private int price;
    private List<TypeOfService> typesOfService;
    /*
    Конструктор
     */
    public Service(List<TypeOfService> typesOfService) {
        this.typesOfService = typesOfService;
    }
    /*
    Геттеры и сеттеры для всех полей класса кроме id
     */
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setTypesOfService(List<TypeOfService> typesOfService) {
        this.typesOfService = typesOfService;
    }
    public List<TypeOfService> getTypesOfService() {
        return typesOfService;
    }
}
