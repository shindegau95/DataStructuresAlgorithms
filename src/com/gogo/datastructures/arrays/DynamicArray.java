package com.gogo.datastructures.arrays;

import java.util.ArrayList;

public class DynamicArray<T> {

    private ArrayList<T> data;

    public DynamicArray() {
        this.data = new ArrayList<>();
    }

    public T pop(){
        if(data.size() == 0){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            T value = data.get(data.size()-1);
            data.remove(data.size()-1);
            return value;
        }
    }

    public T get(int index){
        return data.get(index);
    }

    public void push(T newData){
        this.data.add(newData);
    }

    public void unshift(T newData){
        data.add(0, newData);
    }

    public void splice(int startIndex, int numberOfElementsToBeDeleted){
        if(startIndex == data.size() || startIndex + numberOfElementsToBeDeleted > data.size()){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            for (int i = startIndex; i < startIndex + numberOfElementsToBeDeleted; i++) {
                data.remove(i);
            }
        }
    }

    public int size(){
        return data.size();
    }

}
