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
        return front == rear;
    }

    /*
    Метод, проверяющий, переполнена ли очередь
     */
    public boolean isFull() {
        return (rear + 1) % size == front;
    }


    /*
    Добавляет элемент в конец очереди
     */
    public void enqueue(T item) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        queue[rear] = item;
        rear = (rear + 1) % size;
    }

    /*
    Удаляет элемент из начала очереди
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        T item = queue[front];
        queue[front] = null;
        front = (front + 1) % size;
        return item;
    }
}

