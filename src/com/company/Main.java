package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("White", 120, 4500);
        Lamp lamp2 = new Lamp("Whote", 120, 4500);
        Lamp lamp3 = new Lamp("Whyte", 120, 4500);


        Set<Lamp> mySet = new HashSet();
        mySet.add(lamp1);
        mySet.add(lamp2);
        mySet.add(lamp3);

        System.out.println(lamp1.hashCode());
        System.out.println(lamp2.hashCode());
        System.out.println(lamp3.hashCode());

    }
}
