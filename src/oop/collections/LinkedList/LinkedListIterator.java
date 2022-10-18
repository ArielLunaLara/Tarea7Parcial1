package oop.collections.LinkedList;

public class LinkedListIterator {
    private Node iterator;

    public LinkedListIterator(Node node){
        this.iterator = node;
    }

    public boolean hasNext(){
        return iterator.getNext() != null;
    }

    public String Next(){
        if(iterator.getNext() != null) {
            String data = iterator.getData();
            iterator = iterator.getNext();
            return data;
        }else{
            return null;
        }
    }
}
