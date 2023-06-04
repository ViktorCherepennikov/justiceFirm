package org.example.collection.list;
/*
Реализация адресного разомкнутого неупорядоченного двунаправленного списка с заголовком
 */
public class LinkedList<T> {
    /*
    Вложенный класс заголовка, сделанный в виде узла.
    data - это данные, которые хранятся в узле списка, prev - ссылка на предыдущий узел в списке,
    next - ссылка на следующий узел в списке.
     */
    class Node<T> {
        T data;
        Node<T> prev;
        Node<T> next;
    }
    Node<T> head;
    int size;

    // Конструктор
    public LinkedList() {
        head = new Node<T>();
        head.prev = null;
        head.next = null;
        size = 0;
    }

    // Нереализованные методы для добавления и удаления узлов
    public void addFirst(T data) {}
    public void addLast(T data) {}
    public void removeFirst() {}
    public void removeLast() {}

    // Нереализованные методы для доступа к элементам списка
    public T getFirst() {return null;}
    public T getLast() {return null;}
    public T get(int index) {return null;}

    // Нереализованные методы для проверки наличия элементов в списке
    public boolean isEmpty() {return false;}
    public int size() { return size; }
}
