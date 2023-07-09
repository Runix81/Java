package ru.krohmal.api.homework4;

import ru.krohmal.api.homework2.BubbleSort;
import ru.krohmal.api.homework2.JsonParse;
import ru.krohmal.api.homework2.SqlSelect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork4Menu {
    public static void main(String[] args) {

    }

    public static void start() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean t = true;
        while (t) {
            System.out.print("Меню:\nНажмите 1 для перехода к задаче №1\nНажмите 2 для перехода к задаче №2\nНажмите 3 для перехода к задаче №3\nНажмите 0 для выхода\n");
            int selectMenu = Integer.parseInt(br.readLine());
            if (selectMenu == 1) {
                ReverseList.start();
            } else if (selectMenu == 2) {
                WorkWithList.menu();
            } else if (selectMenu == 3) {
                StackCalculate.calcMenu();
            } else if (selectMenu == 0) {
                t = false;
                System.out.println("Завершение работы");
            }
        }
    }
}