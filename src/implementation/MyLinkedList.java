package implementation;

import myinterface.LinkedListADT;

public class MyLinkedList implements LinkedListADT {
    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }
    @Override
    public boolean addLast(float element) {
        boolean response = false;
        Node node = new Node(element);
        if(isEmpty()){
            head = node;
            tail = node;
            size++;
            response = true;
        }
        else {
            node.setNext(head);
            head = node;
            size++;
            response = true;
        }
        return response;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public float sum() {
        float sum = 0;
        Node temp = head;
        while(temp != null){
            sum = sum + temp.getData();
            temp = temp.getNext();
        }
        return sum;
    }

    @Override
    public float mean() {
        float mean = 0;
        Node temp = head;
        while(temp != null){
            mean = mean + temp.getData();
            temp = temp.getNext();
        }
        return mean/size;
    }
}