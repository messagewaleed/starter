package com.socgen.development;

public class MethodLocalDemo {
    public static void main(String[] args) {
        new MethodLocalDemo().met();
    }

    void met(){
        int vr = 90;
        class Inner{
            void in(){
                System.out.println("Inner's in..., vr : " + vr);
            }
        }
        new Inner().in();
    }

//    public static final String COLOR = "BLUE";
//
//    Integer age = 31; //Effectively final starting Java 8

}
