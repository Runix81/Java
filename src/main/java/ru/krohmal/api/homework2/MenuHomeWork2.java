package ru.krohmal.api.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuHomeWork2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean t = true;
        while (t) {
            System.out.print("Меню:\nНажмите 1 для перехода к задаче №1\nНажмите 2 для перехода к задаче №2\nНажмите 3 для перехода к задаче №3\nНажмите 0 для выхода\n");
            int selectMenu = Integer.parseInt(br.readLine());
            if (selectMenu == 1) {
                SqlSelect.start();
            }
            else if (selectMenu == 2) {
                BubbleSort.start();
            }
            else if (selectMenu == 3) {
                JsonParse.start();
            }
            else if (selectMenu == 0){
                t = false;
                System.out.println("Завершение работы");
            }
        }
    }
}


