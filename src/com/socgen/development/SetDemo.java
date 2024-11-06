package com.socgen.development;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(450);
        set.add(1);
        set.add(98989);
        set.add(450);
        set.add(23);

        System.out.println(set);
    }
}
