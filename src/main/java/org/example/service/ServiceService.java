package org.example.service;

import org.example.model.Client;
import org.example.model.Service;

import java.util.List;

public interface ServiceService {

/*
Сервисный класс услуги
*/

    List<Service> findAll(Client client); // Метод возвращает все услуги для переданного клиента
    void editClientsServises(Client client); // Метод позволяет изменить список услуг для переданного клиента
    void saveService(Service service); // Сохраняет услугу
    void deleteService(Client client); // Удаляет услугу для переданного клиента
    int getPrice(Client client); // Позволяет высчитать стоимость услуг оказанных для переданного клиента

}

