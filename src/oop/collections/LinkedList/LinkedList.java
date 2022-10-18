package oop.collections.LinkedList;

public class LinkedList {
    private Node head;
    private Node tail;
    private int size;

    public void addAtTail(String data){
        Node node = new Node(data);

        node.setPrevious(tail);
        tail = node;

        if(head == null){
            head = node;
        }else{
            node.getPrevious().setNext(node);
        }
        size ++;
    }

    public void addAtFront(String data){
        Node node = new Node(data);

        node.setNext(head);
        head = node;

        if(head == null){
            tail = node;
        }else{
            node.getNext().setPrevious(node);
        }
        size++;
    }
    public boolean remove(int indexToRemove){
        if(indexToRemove < 0 || indexToRemove >= size){
            return false;
        }
        if(size == 1){
            head = null;
            tail = null;
        }else if(indexToRemove == 0){
            head= head.getNext();
            head.setPrevious(null);
        }else if(indexToRemove == size - 1){
            tail = tail.getPrevious();
            tail.setNext(null);
        }else{
            Node iteratorNode = findNodeByIndex(indexToRemove);
            iteratorNode.getPrevious().setNext(iteratorNode.getNext());
            iteratorNode.getNext().setPrevious(iteratorNode.getPrevious());
        }
        size--;
        return true;
    }

    public void removeAll(){
        LinkedListIterator aux= this.getIterator();
        while(aux.hasNext()){
            aux.Next();
            this.remove(0);
        }
    }

    public boolean setAt(int index, String data){
        if(index < 0 || index >= size){
            return false;
        }
        Node node = findNodeByIndex(index);

        node.setData(data);
        return true;
    }

    public String getAt(int index){
        if(index < 0 || index >= size){
            return null;
        }
        Node node = findNodeByIndex(index);
        return node.getData();
    }

    public boolean removeWithValue(String data){
        Node iteratorNode =  head;
        int indexIteratorNode = 0;

        while(indexIteratorNode < size && iteratorNode.getData() == data){
            indexIteratorNode++;
        }
        if (indexIteratorNode != size){
            return remove(indexIteratorNode);
        }
        else{
            return false;
        }
    }

    public int size(){
        return size;
    }

    public LinkedListIterator getIterator(){
        LinkedListIterator iterator = new LinkedListIterator(head);
        return iterator;
    }

    private Node findNodeByIndex(int index) {
        Node iteratorNode = head;
        int indexIteratorNode = 0;

        while (indexIteratorNode < index){
            iteratorNode = iteratorNode.getNext();
            indexIteratorNode++;
        }
        return iteratorNode;
    }
}
