package lesson12;

/**
 * Created by Admin on 01.09.2016.
 */
public class LinkedDeque implements Deque {
    private Node first;
    private Node last;
    private int size = 0;

    @Override
    public boolean pushFirst(int elem) {
        if(size == 0){
            last = first = new Node(elem);
//            first.value = elem;
//            last = first;
            size++;
        } else {
            Node nd =new Node (elem);

            first.value = elem;
        }

        return false;
    }

    @Override
    public boolean pushLast(int elem) {
        return false;
    }

    @Override
    public Integer popFirst() {
        return null;
    }

    @Override
    public Integer popLast() {
        return null;
    }

    @Override
    public Integer takeFirst() {
        return null;
    }

    @Override
    public Integer takeLast() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    //inner class вложение
//    class Node{
//
//    }
    //nested class внутрение
    private  static class Node{
        Node next;
        Node prev;
        int value;

        public Node(Node next, Node prev, int value){
            this.next = next;
            this.prev = prev;
            this.value= value;

        }

    }

}
