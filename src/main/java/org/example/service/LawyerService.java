package org.example.service;

import org.example.collection.queue.Queue;
import org.example.model.Client;
import org.example.model.Lawyer;

import java.util.List;

public interface LawyerService {

/*
Сервисный класс юриста
*/

    Lawyer findLawyerBySecondName(String secondName);
    List<Lawyer> findAll(); // Метод возвращает всех юристов фирмы
    Queue <Client> findAllLawyerClients(Lawyer lawyer); // Метод возвращает всех клиентов переданного юриста
    void saveLawyer(Lawyer lawyer); // Сохраняет нового юриста
    void editLawyer(Lawyer lawyer); // Изменяет существующшего юриста
    void editLawyersClient(Client client); // Изменяет клиента юриста
}

