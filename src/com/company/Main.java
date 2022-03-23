package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.SocketHandler;

public class Main {

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("White", 120, 4500);
        Lamp lamp2 = new Lamp("Whote", 1200, 4500);
        Lamp lamp3 = new Lamp("Whyte", 5000, 4500);


        Set<Lamp> mySet = new HashSet();
        mySet.add(lamp1);
        mySet.add(lamp2);
        mySet.add(lamp3);

        System.out.println(lamp1.hashCode());
        System.out.println(lamp2.hashCode());
        System.out.println(lamp3.hashCode());

        System.out.println(mySet.hashCode());
        System.out.println(mySet.contains(lamp3));
        System.out.println(mySet.equals(lamp1));
        System.out.println(mySet.);
    }
}
