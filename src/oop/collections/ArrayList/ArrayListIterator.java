package oop.collections.ArrayList;

public class ArrayListIterator {
    private ArrayList arrayList;
    private int currentIndex=0;

    public ArrayListIterator(ArrayList arrayList) {
        this.arrayList = arrayList;
    }

    public boolean hasNext(){
        return currentIndex < arrayList.getSize();
    }

    public String Next() {
        return arrayList.getAt(currentIndex++);
    }
}
