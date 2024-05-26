package uy.edu.um.prog2.adt.Queue;

public interface Queue<T> {

    void enqueue(T value);

    T dequeue() throws EmptyQueueException;

    boolean contains(T value);

    int size();

    boolean isEmpty();
}
