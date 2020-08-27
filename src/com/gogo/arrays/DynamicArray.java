package com.gogo.arrays;

import java.util.ArrayList;

public class DynamicArray<T> {

    private final ArrayList<T> arrayList;

    public DynamicArray() {
        arrayList = new ArrayList<>();
    }

    public void push(T newItem) {
        //O(1)
        arrayList.add(newItem);
    }

    public T pop(){
        //O(1)
        return arrayList.remove(arrayList.size()-1);
    }

    public void unshift(T newItem){
        //O(n)
        arrayList.add(0, newItem);
    }

    public void splice(int start, int numberOfElementsToBeDeleted){
        //O(n)
        if(start + Math.max(0, numberOfElementsToBeDeleted - 1) >= size()){
            //['a','b']
            //splice(1,1)
            throw new ArrayIndexOutOfBoundsException();
        }else{
            for (int i=start + Math.max(0, numberOfElementsToBeDeleted - 1); i>=start; i--){
                arrayList.remove(i);
            }
        }
    }

    public T get(int index){
        return arrayList.get(index);
    }

    public int size(){
        return arrayList.size();
    }
}
