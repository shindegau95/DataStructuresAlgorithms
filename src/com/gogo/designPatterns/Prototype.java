package com.gogo.designPatterns;


class Prototype implements Cloneable{

    private String firstName;
    private String lastName;


    private Prototype(){

    }

    public Prototype(String name){
        this.firstName = name;

        lastName = Integer.toString(hashCode()) ;

    }

    public Prototype getClone(){ //t1
       return new Prototype(firstName);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return this.firstName + this.lastName;
    }
}

class PrototypeMain{
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype p1 = new Prototype("Crystal");
        Prototype p2 = p1.getClone();
        Prototype p3 = (Prototype) p1.clone();

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode() == p2.hashCode());
        System.out.println();
        System.out.println(p1.equals(p3));
        System.out.println(p1.hashCode() == p3.hashCode());

        System.out.println(Integer.toString(p1.hashCode()).equals(Integer.toString(p3.hashCode())));

    }
}

/*
com.gogo.designPatterns.Prototype@1b6d3586
com.gogo.designPatterns.Prototype@4554617c
com.gogo.designPatterns.Prototype@74a14482
* */

/*
Crystal460141958
Crystal1163157884
Crystal460141958
* */