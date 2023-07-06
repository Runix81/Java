package ru.krohmal.api.homework4;

import java.util.LinkedList;
import java.util.Random;

public class ReverseList {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        Random random = new Random();
        LinkedList<Integer> list = new LinkedList<>();
        int numEl = random.nextInt(10,16);
        for (int i = 0; i < numEl; i++) {
            list.add(i, random.nextInt(0,10));
        }
        System.out.println(list);
        for (int i = 0; i < numEl; i++){
            list.add(i, list.getLast());
            list.removeLast();
        }
        System.out.println(list);
    }


}
