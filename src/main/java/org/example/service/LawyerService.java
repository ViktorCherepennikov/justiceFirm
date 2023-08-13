package org.example.service;

import org.example.collection.list.LinkedList;
import org.example.collection.queue.Queue;
import org.example.model.Client;
import org.example.model.LawFirm;
import org.example.model.Lawyer;

/**
Сервис юриста
*/
public interface LawyerService {

    /**
     * Поиск всех юристов в списке юристов фирмы по переданной фамилии.
     *
     * @param firm фирма, в которой будут искаться юристы
     * @param secondName переданная фамилия
     * @return список подходящих юристов
     */
    LinkedList<Lawyer> findLawyerBySecondName(LawFirm firm, String secondName);

    /**
     * Метод возвращает всех клиентов переданного юриста
     *
     * @param lawyer юрист
     * @return список клиентов юриста
     */
    Queue <Client> findAllLawyerClients(Lawyer lawyer);

}

