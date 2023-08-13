package org.example;

import java.util.ArrayList;
import java.util.List;
import org.example.collection.list.LinkedList;
import org.example.collection.queue.Queue;
import org.example.model.Client;
import org.example.model.LawFirm;
import org.example.model.Lawyer;
import org.example.model.Service;
import org.example.model.TypeOfService;
import org.example.service.ServiceService;
import org.example.service.impl.ServiceServiceImpl;

public class Main {
    public static void main(String[] args) {
        // Юридическая фирма
        LawFirm lawFirm = new LawFirm(new LinkedList<>());

        // Список клиентов первого юриста, организованный в виде кольцевой очереди на основе обычного массива объектов
        Queue<Client> clientsForFirstLawyer = new Queue<>(4);

        // Список клиентов второго юриста, организованный в виде кольцевой очереди на основе обычного массива объектов
        Queue<Client> clientsForSecondLawyer = new Queue<>(4);

        // Список клиентов третьего юриста, организованный в виде кольцевой очереди на основе обычного массива объектов
        Queue<Client> clientsForThirdLawyer = new Queue<>(4);

        // Список услуг, предоставленных первому клиенту
        List<Service> servicesForFirstClient = new ArrayList<>(5);

        // Список услуг, предоставленных второму клиенту
        List<Service> servicesForSecondClient = new ArrayList<>(5);

        // Список услуг, предоставленных третьему клиенту
        List<Service> servicesForThirdClient = new ArrayList<>(5);

        // Список услуг, предоставленных четвертому клиенту
        List<Service> servicesForFourthClient = new ArrayList<>();

        // Сервис для работы с услугами
        ServiceService serviceService = new ServiceServiceImpl();


        // Создание клиентов и заполнение их списка услуг услугами:

        // Первый клиент и список оказанных ему услуг:
        servicesForFirstClient.add(new Service(TypeOfService.CONSULTATION));
        servicesForFirstClient.add(new Service(TypeOfService.DECLARATION));
        servicesForFirstClient.add(new Service(TypeOfService.PRETENSION));
        Client firstClient = new Client("Иванов", 258747, servicesForFirstClient);

        // Второй клиент и список оказанных ему услуг:
        servicesForSecondClient.add(new Service(TypeOfService.VERIFICATION));
        servicesForSecondClient.add(new Service(TypeOfService.REGISTRATION));
        Client secondClient = new Client("Петров", 7894456, servicesForSecondClient);

        // Третий клиент и список оказанных ему услуг:
        servicesForThirdClient.add(new Service(TypeOfService.CONSULTATION));
        servicesForThirdClient.add(new Service(TypeOfService.DECLARATION));
        servicesForThirdClient.add(new Service(TypeOfService.PRETENSION));
        servicesForThirdClient.add(new Service(TypeOfService.VERIFICATION));
        servicesForThirdClient.add(new Service(TypeOfService.REGISTRATION));
        Client thridClient = new Client("Сидоров", 753159, servicesForThirdClient);


        // Четвертый клиент и список оказанных ему услуг:
        servicesForFourthClient.add(new Service(TypeOfService.CONSULTATION));
        Client fourthClient = new Client("Козлов", 123456,servicesForFourthClient);


        // Создание юристов и заполнение их списка клиентами:

        // Первый юрист фирмы с клиентами, добавленными в кольцевую очередь клиентов в конец списка:
        clientsForFirstLawyer.enqueue(firstClient);
        clientsForFirstLawyer.enqueue(secondClient);
        clientsForFirstLawyer.enqueue(thridClient);
        Lawyer firstLawyer = new Lawyer("Соколов", 555855, clientsForFirstLawyer);

        // Второй юрист фирмы с клиентами, добавленными в кольцевую очередь клиентов в конец списка:
        clientsForSecondLawyer.enqueue(fourthClient);
        Lawyer secondLawyer = new Lawyer("Герасимов",777777,clientsForSecondLawyer);

        // Третий юрист фирмы без клиентов:
        Lawyer thirdLawyer = new Lawyer("Самойлов",666666,clientsForThirdLawyer);


        /*
        Тест 1. Юристы Соколов и Герасимов были добавлены в конец списка, а Самойлов - в конец.
         */

        // Добавление юристов в список юристов фирмы
        LinkedList<Lawyer> lawyerList = lawFirm.getLawyerList();
        lawyerList.addLast(firstLawyer);
        lawyerList.addLast(secondLawyer);
        lawyerList.addFirst(thirdLawyer);

        System.out.println("Тест 1. Юристы Соколов и Герасимов были добавлены в конец списка, а Самойлов - в начало: \n");
        System.out.println("Ожидаемый результат: первый юрист в списке - Самойлов, второй юрист в списке - Соколов, третий юрист - Герасимов \n");
        System.out.println("Фактический результат:");
        for (int i = 0; i < lawyerList.size(); i++) {
            System.out.println(lawyerList.get(i).getSecondName());
        }
        System.out.println("\n");



        /*
        Тест 2. Получить список юристов фирмы, их клиентов, списка и стоимости услуг в том порядке в котором они были добавлены
         */

        System.out.println("Тест 2. Получить список юристов фирмы, их клиентов, списка и стоимости предоставленных услуг в том порядке в котором они были добавлены: \n ");

        for (int i = 0; i < lawyerList.size(); i++ ) {
            System.out.println("        " +  (i + 1) + " юрист:");
            System.out.println(lawyerList.get(i).toString());
            if(lawyerList.get(i).getClients().isEmpty()){
                System.out.println("           У данного юриста клиентов нет");
            }
            for (int j = 0; !(lawyerList.get(i).getClients().isEmpty()); j++) {
                System.out.println("           " + (j + 1) + " клиент:");
                Client client = lawyerList.get(i).getClients().dequeue();
                System.out.println(client.toString());
                client.getServices().forEach(service -> {
                    System.out.println("               " + service.getTypeOfService().getTitle() + ";");
                });
                System.out.println("           Стоимость услуг: " +serviceService.getPrice(client));
            }
        }
        System.out.println("\n");


        /*
        Тест 3. Проверка методов isEmpty и isFull из функционала кольцевой очереди клиентов на основе обычного массива.
         */

        System.out.println("Тест 3. Проверка методов isEmpty и isFull из функционала кольцевой очереди клиентов на основе обычного массива: \n");
        System.out.println("    Кейс 1. Пустая очередь. Ожидаемый результат: isEmpty() == true, isFull() == false.");
        System.out.println("                          Фактический результат: isEmpty() == " + clientsForFirstLawyer.isEmpty() + ", isFull() == " + clientsForFirstLawyer.isFull() + ". \n");

        System.out.println("    Кейс 2. Полная очередь. Ожидаемый результат: isEmpty() == false, isFull() == true.");

        // Заполнение очереди клиентов методом enqueue()
        clientsForFirstLawyer.enqueue(firstClient);
        clientsForFirstLawyer.enqueue(secondClient);
        clientsForFirstLawyer.enqueue(thridClient);
        System.out.println("                          Фактический результат: isEmpty() == " + clientsForFirstLawyer.isEmpty() + ", isFull() == " + clientsForFirstLawyer.isFull() + ". \n");

        System.out.println("    Кейс 3. Удаление клиента из начала очереди методом enqueue(). Метод возвращает удаленного клиента. Ожидаемая фамилия удаленного клиента - Иванов.");
        System.out.println("            Фактический результат: Из списка клиентов был удален клиент с фамилией " + clientsForFirstLawyer.dequeue().getSecondName() + ". \n" );

        System.out.println("    Кейс 4. Очередь не пустая, но не полная. Ожидаемый результат: isEmpty() == false, isFull() == false.");

        // Удаление клиента из начала очереди методом enqueue(). Метод возвращает удаленного клиента. Ожидаемая фамилия удаленного клиента - Иванов.
        clientsForFirstLawyer.dequeue();
        System.out.println("                                           Фактический результат: isEmpty() == " + clientsForFirstLawyer.isEmpty() + ", isFull() == " + clientsForFirstLawyer.isFull() + ". \n");

        /*
        Тест 4. Проверка корректной работы функционала разомкнутого неупорядоченного двунаправленного списка юристов с заголовком.
         */

        System.out.println("Тест 4. Проверка корректной работы функционала разомкнутого неупорядоченного двунаправленного списка юристов с заголовком: \n");
        System.out.println("    Кейс 1. Проверка работы методов getFirst() и getLast(). Методы достают первого и последнего юриста из списка соответственно.");
        System.out.println("            Полный список юристов без списка клиентов: \n");
        for (int i = 0; i < lawyerList.size(); i++) {
            System.out.println(lawyerList.get(i) + "\n");
        }
        System.out.println("Первый юрист в списке. Ожидаемый результат: Самойлов; Фактический результат : \n" + lawyerList.getFirst());
        System.out.println("Последний юрист в списке. Ожидаемый результат: Герасимов; Фактический результат : \n" + lawyerList.getLast());

        System.out.println("    Кейс 2. Проверка работы методов removeFirst() и removeLast()." +
                " Методы удаляют первого и последнего юриста из списка соответственно.");
        System.out.println("            Полный список юристов без списка клиентов: \n");
        for (int i = 0; i < lawyerList.size(); i++) {
            System.out.println(lawyerList.get(i) + "\n");
        }
        System.out.println("Общее количество юристов фирмы : " + lawyerList.size()); // Проверка работы метода size()

        System.out.println("Удаление первого юриста в списке с выводом списка юристов, в котором удаленного юриста не будет. Ожидаемый удаленный юрист: Самойлов.");
        System.out.println("Удаление первого юриста из списка юристов...");
        lawyerList.removeFirst();
        System.out.println("Обновленный список юристов без списка клиентов после удаления первого юриста из списка: \n");
        for (int i = 0; i < lawyerList.size(); i++) {
            System.out.println(lawyerList.get(i) + "\n");
        }
        System.out.println("Общее количество юристов фирмы : " + lawyerList.size()); // Проверка работы метода size()

        System.out.println("Удаление последнего юриста в списке с выводом списка юристов, в котором удаленного юриста не будет. Ожидаемый удаленный юрист: Герасимов.");
        System.out.println("Удаление последнего юриста из списка юристов...");
        lawyerList.removeLast();
        System.out.println("Обновленный список юристов без списка клиентов после удаления последнего юриста из списка: \n");
        for (int i = 0; i < lawyerList.size(); i++) {
            System.out.println(lawyerList.get(i) + "\n");
        }
        System.out.println("Общее количество юристов фирмы : " + lawyerList.size()); // Проверка работы метода size()

        System.out.println("    Кейс 3. Проверка работы методa isEmpty(). Метод возвращает true, если список пустой, и false если нет.");
        System.out.println("    Общее количество юристов фирмы : " + lawyerList.size()); // Проверка работы метода size()
        System.out.println("    Вызов метода isEmpty() на не пустом списке. Ожидаемый результат: false");
        System.out.println("                                              Фактический результат: " + lawyerList.isEmpty());
        lawyerList.removeLast();
        System.out.println("    Общее количество юристов фирмы : " + lawyerList.size()); // Проверка работы метода size()
        System.out.println("    Вызов метода isEmpty() на пустом списке. Ожидаемый результат: true");
        System.out.println("                                              Фактический результат: " + lawyerList.isEmpty());
    }
}