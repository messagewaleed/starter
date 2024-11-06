package com.socgen.development;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(67, "TCS");
        map.put(890, "SocGen");

        System.out.println(map.get(890));
    }
}
