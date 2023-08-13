package org.example.service;

import org.example.model.Client;
import org.example.model.Service;

import java.util.List;

/**
Сервис услуги
*/
public interface ServiceService {
    /**
     * Позволяет высчитать стоимость услуг оказанных для переданного клиента
     * Если помимо консультации есть еще какие-либо предоставленные услуги, то консультация бесплатна.
     * Если у клиента весь перечень услуг, то стоимость отображается со скидкой 10%
     *
     * @param client переданный клиент
     * @return стоимость услуг в числовом значении
     */
    int getPrice(Client client);

}

