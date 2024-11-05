package com.socgen.development;

import com.socgen.training.Animal;
import java.util.Scanner;

public class Main extends Animal{
    public static void main(String[] args) {
        double val = 56.90;
        System.out.println("Value of val : " + val);

        int value = (int) val; //Narrowing - Cast required

        System.out.println(value);

        float f =  value; //Widening, no cast required

        System.out.println(f);

        Scanner scan = new Scanner(System.in);

//        System.out.println("Enter a number");
//
//        int rev = scan.nextInt(), other = 0;

//        boolean flag = false;
//
//        if(flag){
//            System.out.println("TRUE");
//        }else{
//            System.out.println("FALSE");
//        }

//        for (int index = 1; index <= 10; index++)
//            System.out.println(index);

//        int index = 0;
//        while(index <= 10){
//            System.out.println(index);
//            index++;
//        }

//        for(;rev > 0;){
//            other = rev % 10;
//            rev = rev / 10;
//            System.out.print(other);
//        }

//        Or with a while:

//        while (rev > 0){
//            other = rev % 10;
//            rev = rev / 10;
//            System.out.print(other);
//        }


        long []arr = new long[5];
        arr[0] = 90;
        arr[1] = 101;
        arr[2] = 970;
        arr[3] = 8232;
        arr[4] = 9;

        for(int index = 0; index < arr.length; index++){
            System.out.println(arr[index]);
        }

//        OR with Java 5 enhanced for:

        for(long item : arr){
            System.out.println(item);
        }

        Animal animal = new Animal();
        //animal.eat();
        new Main().eat();
        //animal.breathe();

//1-89
//
//        a b c sum
//                a >= 40, b >= 40, c >= 40, sum >=125 -PASS





    }
}