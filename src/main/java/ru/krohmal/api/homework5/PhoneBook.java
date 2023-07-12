package ru.krohmal.api.homework5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    PhoneBook() {

    }

    PhoneBook(String[] data) {
        this.data = data;
    }

    public static void main(String[] args) throws IOException {
        addPhoneBook();
        menu();
    }
    public static void menu() throws IOException {
        boolean f = true;
        while (f) {
            System.out.println("Выберите действие: ");
            System.out.println("1. Добавить запись.");
            System.out.println("2. Найти контакты по фамилии");
            System.out.println("0. Завершить работу.");
            int select = Integer.parseInt(reader.readLine());
            if (select == 1) {
                addElement(hashMap);
            } else if (select == 2) {
                findContact(hashMap);
            } else if (select == 0) {
                f = false;
                System.out.print("Работа завершена.");
            }
        }
    }
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static String[] data = {"Иванов 2645732",
                    "Петров 8472943",
                    "Сидоров 7463829",
                    "Федоров 9388467",
                    "Иванов 9928374",
                    "Козлов 9283746",
                    "Петров 9872645",
                    "Давыдов 8455658",
                    "Петросян 7722334",
                    "Макиавелли 8388472"
            };
    static HashMap <String, List<Integer>> hashMap = new HashMap<>();
    public static HashMap<String,List<Integer>> addPhoneBook(){
        for (String elements: data) {
            String[] parts = elements.split(" ");
            if (hashMap.containsKey(parts[0])){
                hashMap.get(parts[0]).add(Integer.parseInt(parts[1]));
            }
            else {
                ArrayList<Integer> lst = new ArrayList<>();
                lst.add(Integer.parseInt(parts[1]));
                hashMap.put(parts[0],lst);
            }
        }
        return hashMap;
    }
    public static HashMap<String, List<Integer>> addElement(HashMap<String,List<Integer>> hashMap) throws IOException {
        System.out.println("Введите фамилию для добавления в справочник: ");
        String sureName = reader.readLine();
        System.out.println("Введите номер телефона нового контакта: ");
        int number = Integer.parseInt(reader.readLine());
        if (hashMap.containsKey(sureName)){
            hashMap.get(sureName).add(number);
        }
        else {
            ArrayList<Integer> lst = new ArrayList<>();
            lst.add(number);
            hashMap.put(sureName,lst);
        }
        return hashMap;
    }
    public static void findContact(HashMap<String,List<Integer>> hashMap) throws IOException {
        System.out.println("Введите фамилию для поиска: ");
        String sureName = reader.readLine();
        System.out.println(hashMap.get(sureName));
    }
}

