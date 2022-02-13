package com.gogo.designPatterns;


class Singleton {

    private static volatile Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){ //t1
        if(instance == null){ //t1 | t2
            synchronized (Singleton.class){ //t1 | t2
                if(instance == null){ //t2
                    instance =  new Singleton(); //t1
                }
            }
        }
        return instance; //t1 | t2
    }
}

class SingletonMain{
    public static void main(String[] args) {
        Singleton t1 = Singleton.getInstance();
        Singleton t2 = Singleton.getInstance();
        System.out.println(t1);
        System.out.println(t2);
    }
}