package org.example.Service;

import org.example.model.Client;
import org.example.model.Lawyer;

import java.util.List;

public interface LawyerService {
    Lawyer findLawyerBySecondName(String secondName);


    List<Lawyer> findAll();

    List<Client> findAllLawyerClients(Lawyer lawyer);

    void saveLawyer(Lawyer lawyer);
    void editLawyer(Lawyer lawyer);
    void editClient(Client client);
}
