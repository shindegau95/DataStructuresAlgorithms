package com.gogo.datastructures.arrays;

public class StaticArray<T> {

    private T[] data;
    private int length;

    public StaticArray(T[] data) {
        this.data = data;
        this.length = 0;
    }

    public void push(T newData){
        if(this.length == data.length){
            throw new IndexOutOfBoundsException();
        }else{
            this.data[length++] = newData;
        }
    }

    public T pop(){
        if(length == -1){
            throw new IndexOutOfBoundsException();
        }else{
            T dataToRemove = this.data[length-1];
            this.data[length--] = null;
            return dataToRemove;
        }
    }

    public int size(){
        return this.length;
    }

    public T get(int position){
        if(position > length || position<0){
            throw new IndexOutOfBoundsException();
        }else{
            return data[position];
        }
    }

    public void unshift(T newData){
        if(data[length-1] == null){
            throw new IndexOutOfBoundsException();
        }else{
            for(int i=length; i>0; i--){
                data[i] = data[i-1];
            }
            data[0] = newData;
            length++;
        }
    }

    public void splice(int start, int numberOfElementsToBeDeleted) {
        if(start < 0 || start + numberOfElementsToBeDeleted >= length){
            throw new ArrayIndexOutOfBoundsException();
        }else{

            for(int i=start;i<start + numberOfElementsToBeDeleted;i++){
                data[i] = null;
            }
            for(int i=start + numberOfElementsToBeDeleted; i<length; i++){
                data[i-numberOfElementsToBeDeleted]  = data[i];
                data[i] = null;
            }
            length-=numberOfElementsToBeDeleted;

        }
    }
}
