package ru.krohmal.api.homework4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class WorkWithList {
    private static LinkedList elements = new LinkedList();
    public WorkWithList() {

    }
    public WorkWithList(LinkedList linkedList) {
        this.elements = linkedList;
    }
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        menu();
    }
        public static void menu() throws IOException {


        boolean f = true;
        while (f) {
            System.out.println("Меню: \nВведите 1 для добавления елемента в конец списка\nВведите 2 для возврате первого элемента и удаления его\nВведите 3 для возврата первого элемента из списка без удаления\nВведите 0 для завершения работы");
            int checkMenu = Integer.parseInt(reader.readLine());
            if (checkMenu == 1) {
                addEndElement(elements);
            } else if (checkMenu == 2) {
                deleteFirstElementPrint(elements);
            } else if (checkMenu == 3) {
                printFirstElement(elements);
            } else if (checkMenu == 0) {
                f = false;
            }
            }
        }
    public static LinkedList addEndElement(LinkedList linkedList) throws IOException {
        System.out.print("Введите елемент для добавления в список: ");
        elements.addLast(reader.readLine());
        return elements;
    }
    public static LinkedList deleteFirstElementPrint(LinkedList linkedList){
        if (elements.isEmpty()){
            return null;
        }
        else {
            System.out.println(elements.getFirst());
            elements.removeFirst();
            return elements;
        }
    }
    public static LinkedList printFirstElement(LinkedList linkedList){
        if (elements.isEmpty()){
            return null;
        }
        else {
            System.out.println(elements.getFirst());
            return elements;
        }
    }
}
