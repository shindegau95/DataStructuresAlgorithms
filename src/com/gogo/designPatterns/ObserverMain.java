package com.gogo.designPatterns;


import java.util.List;

interface Publisher{
    void addSubscriber(Subscriber subscriber);
    void removeSubscriber(Subscriber subscriber);
    void publish(int number);
}

class Kafka implements Publisher{

    public List<Subscriber> subscribers;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void publish(int number) {
        for (Subscriber subscriber: subscribers){
            subscriber.onUpdate(number);
        }
    }
}

interface Subscriber{
    int onUpdate(int number);
}

class Deepak implements Subscriber{

    @Override
    public int onUpdate(int number) {
        return number * 10;
    }
}

class Gogo implements Subscriber{

    @Override
    public int onUpdate(int number) {
        return number;
    }
}

public class ObserverMain {
}
