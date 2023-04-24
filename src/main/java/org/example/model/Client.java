package org.example.model;

import java.util.List;

/*
Класс клиента
 */
public class Client {
    private int id;
    private String secondName;
    private int phoneNumber;
    private List <Service> services;

    public Client(String secondName, int phoneNumber, List <Service> services) {
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.services = services;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }
}
