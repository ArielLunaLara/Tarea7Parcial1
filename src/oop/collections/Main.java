package oop.collections;
import oop.collections.ArrayList.ArrayList;
import oop.collections.LinkedList.*;

public class Main {
    public static void main(String args[]){
        ArrayList arrayList = new ArrayList();

        arrayList.addAtTail("uno");
        arrayList.addAtTail("dos");
        arrayList.addAtTail("tres");
        arrayList.addAtFront("3");
        arrayList.addAtFront("2");
        arrayList.addAtTail("1");


        int indexIterator = 0;
        while (indexIterator < arrayList.getSize()){
            System.out.println(arrayList.getAt(indexIterator));
            indexIterator++;
        }
    }
}
