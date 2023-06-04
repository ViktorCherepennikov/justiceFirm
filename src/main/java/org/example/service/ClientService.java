package org.example.service;

import org.example.collection.queue.Queue;
import org.example.model.Client;
import org.example.model.Service;

import java.util.List;

public interface ClientService {

/*
Сервисный класс клиента
*/

    Queue <Client> findAll(); // Метод возвращает список всех клиентов
    void saveUser(Client client); // Метод сохраняет нового клиента
    void deleteClient(Long id); // Метод удаляет клиента
    void editClient(Client client); // Метод изменяет клиента
    List<Service> findClientServices (Client client); // Метод возвращает список услуг предоставленных клиенту
}

