package org.example.model;

//Класс юридической фирмы

import org.example.collection.list.LinkedList;

public class LawFirm {
    /*
    Список юристов фирмы,
    организованный в виде адресного разомкнутого неупорядоченного двунаправленного списка с заголовком
     */
    private LinkedList<Lawyer> lawyerList;

    public LawFirm(LinkedList<Lawyer> lawyerList) {
        this.lawyerList = lawyerList;
    }
}
