package org.example.model;

import java.util.ArrayList;
import java.util.List;

/*
Класс услуги
 */
public class Service{
    private int id;
    private int price;


    private List<TypeOfService> typesOfService;

    public Service(List<TypeOfService> typesOfService) {
        this.typesOfService = typesOfService;
    }

    public int getPrice() {
                for (TypeOfService typeOfService : typesOfService) {
                switch (typeOfService){

                case DECLARATION ->  price = 2000;
                case CONSULTATION -> price = 1000;
                case VERIFICATION -> price = 3000;
                case REGISTRATION -> price = 5000;
                case PRETENSION -> price = 4000;
                }
                }

        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public void setTypesOfService(ArrayList<TypeOfService> typesOfService) {
        this.typesOfService = typesOfService;
    }

    public List<TypeOfService> getTypesOfService() {
        return typesOfService;
    }
}
