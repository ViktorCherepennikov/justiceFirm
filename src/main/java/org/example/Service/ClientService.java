package org.example.Service;

import org.example.model.Client;
import org.example.model.Service;

import java.util.List;

public interface ClientService {
    List<Client> findAll();
    void saveUser(Client client);
    void deleteClient(Long id);
    void editClient(Client client);
    List<Service> findClientServices (Client client);
}
