package org.example.model;

import org.example.collection.queue.Queue;

import java.util.List;
/*
Класс юриста
 */
public class Lawyer {
    private int id;
    private String secondName;
    private int phoneNumber;
    /*
    Список клиентов юриста, организованный в виде кольцевой очереди на основе обычного массива объектов
     */
    private Queue<Client> clients;

    public Lawyer(String secondName, int phoneNumber, Queue<Client> clients) {
        this.secondName = secondName;
        this.phoneNumber = phoneNumber;
        this.clients = clients;
    }

}
