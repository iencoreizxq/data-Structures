package com.company;


import java.util.Objects;

//牺牲一个元素 在tail（队尾）循环到front（队首）之前时，front前一个位置，不会被添加元素，所以叫牺牲一个
//再添加时，如果要添加的是front前那个位置，则resize添加容量，tail会指向新添加容量第一个位置，即（tail+1）% length == front，添加容量
public class LoopQueue<E> implements Queue<E> {
    private E[] data;
    private int front,tail;
    private int size;

    public LoopQueue(int capacity) {
        data = (E[]) new Object[capacity + 1];
        front = 0;
        size = 0;
    }

    public LoopQueue(){
        this(10);
    }

    public int getCatacity(){
        return data.length - 1;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front == tail;
    }

    @Override
    public void enqueue(E e) {
        if ((tail + 1) % data.length == front)
            resize(getCatacity() * 2);
        data[tail] = e;
        tail = (tail + 1) % data.length;
        size++;
    }

    private void  resize(int newCapacity){

        E[] newData = (E[]) new Object[newCapacity + 1];
        for (int i = 0 ; i < size ; i ++)
            newData[i] = data[(i + front) % data.length];
        data = newData;
        front = 0;
        tail = size;

    }

    @Override
    public E dequeue() {

        if (isEmpty())
            throw new IllegalArgumentException("Cannot dequeue from an empty queue");

        E ret = data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size --;
        if (size == getCatacity() / 4 && getCatacity() / 2 != 0){
            resize(getCatacity() / 2);
        }
        return ret;
    }

    @Override
    public E getFront() {
        if (isEmpty())
            throw new IllegalArgumentException("Queue is empty");
        return data[front];
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Queue: size = %d , capacity = %d\n", size, getCatacity()));
        res.append("front [");
        for (int i = front ; i != tail ; i = (i + 1) % data.length){
            res.append(data[i]);
            if ((i + 1) % data.length != tail)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args) {
        LoopQueue<Integer> queue = new LoopQueue<>();
        for (int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }

}
