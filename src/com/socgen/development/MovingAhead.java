package com.socgen.development;

import java.util.Objects;

class Other{
    void work(Laptop laptop){
        //Do something with these here
    }
}

interface Computer{
    void calculate();
}


//Java 17 records

record Laptop(Integer ram, String name, String uId) implements Computer {
    @Override
    public void calculate() {
        System.out.println("Laptop's calculate...");
    }

    @Override
    public boolean equals(Object ref) {
      return this.ram().equals(((Laptop)ref).ram());
    }

}



//java 5 enums
//enum MyEnum{FIRST, SECOND, THIRD}

//class Laptop implements Computer{
//    private int ram;
//    private String name;
//    private String uId;
//
//    Laptop(){
//
//    }
//
//
//    public void setRam(int ram){
//        this.ram = ram;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public void setUId(String uId){
//        this.uId = uId;
//    }
//
//    public int getRam(){
//        return this.ram;
//    }
//
//    public String getName(){
//        return this.name;
//    }
//
//    public String getUId(){
//        return this.uId;
//    }
//
//    Laptop(int ram, String name, String uId){
//        this.ram = ram;
//        this.name= name;
//        this.uId = uId;
//    }
//
//    Laptop(int ram, String name){
//        this.ram = ram;
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Laptop{" +
//                "ram=" + ram +
//                ", name='" + name + '\'' +
//                ", uId='" + uId + '\'' +
//                '}';
//    }
//
//    @Override
//    public void calculate() {
//        System.out.println("Laptop's calculate...");
//    }
//}

class SmartPhone implements Computer{

    private String name;
    private int ram;
    private String manufacturer;

    SmartPhone(){

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "name='" + name + '\'' +
                ", ram=" + ram +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public SmartPhone(String name, int ram, String manufacturer) {
        this.name = name;
        this.ram = ram;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public void calculate() {
        System.out.println("Smartphone's calculate...");
    }

    void takeVideos(){
        System.out.println("Smartphones can take vidoes as well...");
    }
}


public class MovingAhead{

    void doSomething(SmartPhone computer){

    }
    public static void main(String[] args) {

        Computer []computers = new Computer[7];

       // computers[0] = new Computer(); //Won't work...

       // Computer ref = new SmartPhone("X56", 8, "Lenovo");

        //new MovingAhead().doSomething((SmartPhone) ref);

//        ref.calculate();
//
//        ref = new Laptop();
//
//        ref.calculate();


        SmartPhone secondPhone = new SmartPhone("S23", 12, "Samsung");
        SmartPhone phone = new SmartPhone("X56", 8, "Lenovo");


    Laptop firstLaptop = new Laptop(8, "EliteBook", "73882656");
    Laptop secondLaptop = new Laptop(16, "EliteBook", "73882656");

    if(firstLaptop.equals(secondLaptop)){
        System.out.println("Same laptops");
    }else{
        System.out.println("Different laptops...");
    }


    Laptop thirdLaptop = new Laptop(16, "ChromeBook", "232388");

    Laptop laptopForIndia = new Laptop(8, "macbook pro", "82798230");

        computers[0] = firstLaptop;
        computers[1] = secondLaptop;
        computers[2] = thirdLaptop;
        computers[3] = laptopForIndia;
        computers[4] = new Laptop(16, "ChromeBook", "76287298");
        computers[5] = secondPhone;
        computers[6] = phone;

        System.out.println("Laptop details: ");

    for(Computer computer : computers){
        computer.calculate();

        if(computer instanceof SmartPhone){
            ((SmartPhone)computer).takeVideos();
        }
    }



//    java.lang.Object
//                - public String toString()






//        System.out.println(firstLaptop.name + " with ram : " + firstLaptop.ram);


        Calculate calculate = new Calculate();
        calculate.add(12, 90, 78, 666);
    calculate.add();
    calculate.add(67, 90990, 5);

    }
    
    
    
}

class Calculate{
    int total;
    void add(int... values){ //0-n
       for(int value : values){
           total += value;
       }
        System.out.println("Addition of numbers : " + total);
    }
}




