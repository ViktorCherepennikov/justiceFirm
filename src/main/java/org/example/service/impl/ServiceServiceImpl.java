package org.example.service.impl;


import java.util.List;
import org.example.model.Client;
import org.example.model.Service;
import org.example.model.TypeOfService;
import org.example.service.ServiceService;

public class ServiceServiceImpl implements ServiceService {

    @Override
    public int getPrice(Client client) {
        List<Service> services = client.getServices();
        int totalPrice = 0;
        for (Service service : services) {
            if (service.getTypeOfService() == TypeOfService.CONSULTATION && services.size() > 1) {
                totalPrice -= 5;
            }
            totalPrice += service.getPrice();
        }
        if (services.size() == TypeOfService.values().length){
            return (int) (totalPrice * 0.9);
        }
        return totalPrice;
    }
}