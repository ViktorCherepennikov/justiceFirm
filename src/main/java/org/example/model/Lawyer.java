package org.example.model;

import java.util.List;
/*
Класс юриста
 */
public class Lawyer {
    private int id;
    private String secondName;
    private int phoneNumber;
    private List<Client> clients;

    public Lawyer(String secondName, int phoneNumber, List<Client> clients) {
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.clients = clients;
    }

}
