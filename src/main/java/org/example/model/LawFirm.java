package org.example.model;

import org.example.collection.list.LinkedList;

/**
 * Класс юридической фирмы
 */
public class LawFirm {
    /*
    Список юристов фирмы,
    организованный в виде адресного разомкнутого неупорядоченного двунаправленного списка с заголовком
     */
    private LinkedList<Lawyer> lawyerList;

    public LawFirm(LinkedList<Lawyer> lawyerList) {
        this.lawyerList = lawyerList;
    }
    public LawFirm() {}

    public LinkedList<Lawyer> getLawyerList() {
        return lawyerList;
    }

    public void setLawyerList(LinkedList<Lawyer> lawyerList) {
        this.lawyerList = lawyerList;
    }
}
