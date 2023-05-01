package org.example.collection.queue;

/*
Реализация кольцевой очереди
 */
public class Queue<T> {

    /*
    Поля класса
     */
    private T[] queue;
    private int front;
    private int rear;
    private int size;

    /*
    Конструктор
     */
    public Queue(int size) {
        this.size = size;
        queue = (T[]) new Object[size];
        front = 0;
        rear = 0;
    }

    /*
    Метод проверяющий, пустая ли очередь
     */
    public boolean isEmpty() {
        return false;
    }

    /*
    Метод, проверяющий, переполнена ли очередь
     */
    public boolean isFull() {
        return false;
    }

    /*
    Добавляет элемент в конец очереди
     */
    public void enqueue(T item) {}

    /*
    Удаляет элемент из начала очереди
     */
    public T dequeue() {return null;}
}

