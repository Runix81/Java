package ru.krohmal.api.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class StackCalculate {
    private static LinkedList elements = new LinkedList();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    StackCalculate() {

    }

    StackCalculate(LinkedList linkedList) {
        this.elements = linkedList;
    }

    public static void main(String[] args) throws IOException {
        calcMenu();
    }

    public static void calcMenu() throws IOException {
        boolean f = true;
        while (f) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Посчитать.");
            System.out.println("2. Вывести последнюю операцию и удалить.");
            System.out.println("0. Завершить работу.");
            int select = Integer.parseInt(reader.readLine());
            if (select == 1) {
                calculate(elements);
            } else if (select == 2) {
                chancelOperation(elements);
            } else if (select == 0) {
                f = false;
                System.out.print("Работа завершена.");
            }
        }
    }
    public static LinkedList calculate(LinkedList linkedList) throws IOException {
        double res;
        System.out.println("Введите первое число: ");
        double x = Double.parseDouble(reader.readLine());
        elements.addLast(x);
        System.out.println("Выбирите действие (+,-,*,/): ");
        String d = reader.readLine();
        elements.addLast(d);
        System.out.println("Введите второе число: ");
        double y = Double.parseDouble(reader.readLine());
        elements.addLast(y);
        if (elements.get(elements.size()-2).equals("+")){
            res = x + y;
            System.out.println(res);
            elements.addLast(res);
        }
        else if (elements.get(elements.size()-2).equals("-")){
            res = x - y;
            System.out.println(res);
            elements.addLast(res);
        }
        else if (elements.get(elements.size()-2).equals("*")) {
            res = x * y;
            System.out.println(res);
            elements.addLast(res);
        }
        else if (elements.get(elements.size()-2).equals("/")) {
            res = x / y;
            System.out.println(res);
            elements.addLast(res);
        }
       return elements;
    }
    public static LinkedList chancelOperation(LinkedList linkedList) {
        if (elements.isEmpty()) {
            return null;
        } else {
            String s = "";
            for (int i = elements.size() - 4; i < elements.size(); i++) {
                s += elements.get(i);
                s+= " ";
            }
            System.out.println(s);
            for (int i = 0; i < 4; i++) {
                elements.removeLast();
            }
            return elements;
        }
    }
}



