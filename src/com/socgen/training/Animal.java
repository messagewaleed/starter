package com.socgen.training;

public class Animal {
    int eyes;
    int legs;
//    Scope ReturnType identifier(Parameter List){
//
//    }
    private void breathe(int nose){

        System.out.println("com.socgen.training.Animal's breathe...");
    }
    void sleep(){
        byte b = 0;
        System.out.println(b);
        System.out.println("com.socgen.training.Animal's sleep...");

        for(int index = 10; index < 11; index++) {
            System.out.println(index);
        }
            //System.out.println(index);
    }
    protected void eat(){

        System.out.println("com.socgen.training.Animal's eat...");
    }
}

class ClassObjectDemo{
    public static void main(String[] args) {
        Animal ref;
        ref = new Animal();
        ref.eat();
        System.out.println(ref.eyes);
        //ref.breathe();

//        new Animal().breathe(1);

    }
}

//boolean - false
//byte
//short
//int
//long - 0
//char - \u0000
//float
//double - 0.0
//
//Ref var - null
