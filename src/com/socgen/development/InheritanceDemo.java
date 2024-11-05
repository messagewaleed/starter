package com.socgen.development;

public class InheritanceDemo {
    public static void main(String[] args) {
        Deepak deepak = new Deepak();
        deepak.breathe();
        deepak.smile();
    }
}


interface Human{
    void breathe();

    void smile();
    void eat();

//    After sometime:
    static void walk(){// Works starting Java 8 : Either default of static
        System.out.println("can be added starting java 8...");
    }
}

class Deepak implements Human{
    @Override
    public void breathe() {

    }

    @Override
    public void smile(){
        System.out.println("Deepak's own way of smiling...");
    }

    @Override
    public void eat() {

    }
}

//public
//protected
//package-private
//private

class Shravan implements Human{
    void sing(){
        System.out.println("Shravan can sing...");
    }

    @Override
    public void breathe() {

    }

    @Override
    public void smile() {
        System.out.println("Shravan's smile...");
    }

    @Override
   public void eat() {

    }
}
