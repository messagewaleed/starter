package com.socgen.development;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingCollectionsDemo {
    public static void main(String[] args) {
        ArrayList<Laptop> list = new ArrayList<>();

        list.add(new Laptop(8, "EliteBook", "73882656"));
        list.add(new Laptop(32, "EliteBook", "823928"));
        list.add(new Laptop(16, "Notebook", "212312"));
        list.add(new Laptop(8, "EliteBook", "72441"));
        list.add(new Laptop(24, "Notebook", "564225"));



//        Collections.sort(list, new SortLaptopsByName());

//        Or starting java 8:

        list.sort(new SortLaptopsByUId());

        System.out.println("After sorting, list: ");

        list.forEach(System.out::println);
    }
}


class SortLaptopsByRam implements Comparator<Laptop>{

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.ram().compareTo(o2.ram());
    }
}

class SortLaptopsByName implements Comparator<Laptop>{

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.name().compareTo(o2.name());
    }
}

class SortLaptopsByUId implements Comparator<Laptop>{

    @Override
    public int compare(Laptop o1, Laptop o2) {
        return o1.uId().compareTo(o2.uId());
    }
}