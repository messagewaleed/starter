package com.socgen.development;

public class EnumDemo {
    public static void main(String[] args) {
        new PizzaShop().getMenu();
    }
}

enum PizzaSize{SMALL(2), MEDIUM(4), LARGE(6), XLARGE(8);
    private int serving;
    PizzaSize(int serving){
        this.serving = serving;
    }

    public int getServing(){
        return this.serving;
    }


}

class PizzaShop{
    void getMenu() {
        System.out.println("Dear customer, we have the following sizes available:");
        for (PizzaSize size : PizzaSize.values()) {
            System.out.println(size + " serves " + size.getServing() + " people...");
        }
    }
}

