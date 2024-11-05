package com.socgen.development;

public class RegularInnerClassDemo {
    public static void main(String[] args) {
//        new Outer().met();

        new Outer().new Inner().in();

    }
}

// 1. Regular Inner Classes

class Outer{
    private int flat;

    void met(){
        new Inner().in();
    }
    class Inner{
        private int flat;

        void in(){
            int flat = 0;
            System.out.println("Inner's in()...");
            System.out.println("local flat " + flat);
            System.out.println("Inner's flat : " + this.flat);
            System.out.println("flat of Outer : " + Outer.this.flat);
        }
    }
}
