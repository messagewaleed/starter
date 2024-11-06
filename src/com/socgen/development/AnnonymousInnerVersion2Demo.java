package com.socgen.development;

public class AnnonymousInnerVersion2Demo {
    public static void main(String[] args) {
//        I want to call SomeOther's met
        new SomeOther().met(new InPerson() {
            @Override
            public void workFromOffice() {
                System.out.println("Special coding this...");
            }
        });
    }
}


interface InPerson{
    void workFromOffice();
}

class SomeOther{
    void met(InPerson ref){
        ref.workFromOffice();
    }
}


//
//Collections
//    - Growable
//    - Shrinkable
//    - Sortable
//    - Searchable
//    - Store objects
//
//        Ordering

//Lohit
//Mohit
//Aksha
//Sridesh
//Sumit

//Print them back on screen:



//Lohit
//Sumit
//Mohit
//Aksha
//Sridesh














