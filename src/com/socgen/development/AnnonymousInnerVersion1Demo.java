package com.socgen.development;

public class AnnonymousInnerVersion1Demo {
    public static void main(String[] args) {
        //I want to call Remote's workFromHome...
        Remote remote = new Remote() {
            @Override
            public void workFromHome() {
                System.out.println("Special this...");
            }
        };
        remote.workFromHome();
    }
}

//class Sub implements Remote{
//
//    @Override
//    public void workFromHome() {
//        System.out.println("Working from home after 2020...");
//    }
//}


interface Remote{
    void workFromHome();
}
