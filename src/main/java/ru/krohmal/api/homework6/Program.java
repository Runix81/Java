package ru.krohmal.api.homework6;

import java.util.HashSet;

public class Program {
    public static void main(String[] args) {
        prog1();
        prog2();
    }

    static void prog1(){
        HashSet<Cat> catSat = new HashSet<>();
        catSat.add(new Cat("Vasya", 5, 10, "male"));
        catSat.add(new Cat("Musya", 7, 8, "female"));
        catSat.add(new Cat("Rijik", 3, 7, "male"));
        catSat.add(new Cat("Belka", 6, 6, "female"));
        catSat.add(new Cat("Vasya", 5, 10, "male"));
        catSat.add(new Cat("Kisa", 5, 5, "female"));
        System.out.println(catSat.hashCode());
        System.out.println(catSat);

    }
   static void prog2(){
        Cat cat1 = new Cat("Vasya", 5, 10, "male");
        System.out.println(cat1.hashCode());
        Cat cat2 = new Cat("Musya", 7, 8, "female");
        System.out.println(cat2.hashCode());
        System.out.println(cat1.equals(cat2));
        Cat cat3 = new Cat("Vasya", 5, 10, "male");
        System.out.println(cat1.equals(cat3));
    }

}









