package org.example.collection.list;
/**
Реализация адресного разомкнутого неупорядоченного двунаправленного списка с заголовком
 */
public class LinkedList<T> {
    /**
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
        head = new Node<>();
        head.prev = null;
        head.next = null;
        size = 0;
    }

    // методы для добавления и удаления узлов
    public void addFirst(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.prev = head;
        newNode.next = head.next;
        if (head.next != null) {
            head.next.prev = newNode;
        }
        head.next = newNode;
        size++;
    }

    public void addLast(T data) {
        Node<T> newNode = new Node<>();
        newNode.data = data;
        newNode.prev = head.prev;
        newNode.next = null;
        if (head.prev != null) {
            head.prev.next = newNode;
        } else {
            head.next = newNode;
        }
        head.prev = newNode;
        size++;
    }

    public void removeFirst() {
        if (head.next == null) {
            return;
        }
        head.next = head.next.next;
        if (head.next != null) {
            head.next.prev = head;
        }
        size--;
    }

    public void removeLast() {
        if (head.prev == null) {
            return;
        }
        head.prev = head.prev.prev;
        if (head.prev != null) {
            head.prev.next = head;
        }
        size--;
    }

    //методы для доступа к элементам списка
    public T getFirst() {
        if (head.next == null) {
            return null;
        }
        return head.next.data;
    }

    public T getLast() {
        if (head.prev == null) {
            return null;
        }
        return head.prev.data;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node<T> current = head.next;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    //методы для проверки наличия элементов в списке
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
