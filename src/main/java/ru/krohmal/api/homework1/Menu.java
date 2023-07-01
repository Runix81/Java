package ru.krohmal.api.homework1;


import java.io.IOException;
import java.util.Scanner;

public class Menu {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        boolean t = true;
        while (t) {
            System.out.print("Меню:\nНажмите 1 для перехода к задаче №1\nНажмите 2 для перехода к задаче №2\nНажмите 3 для перехода к задаче №3\nНажмите 4 для перехода к задаче №4\nНажмите 0 для выхода\n");
            int selectMenu = Integer.parseInt(sc.nextLine());
            if (selectMenu == 1) {
                TriangleNumber.start();
            }
            else if (selectMenu == 2) {
                SimpleNumbers.start();
            }
            else if (selectMenu == 3) {
                Calculate.start();
            }
            else if (selectMenu == 4){
                Task4.start();
            }
            else if (selectMenu == 0){
                t = false;
                System.out.println("Завершение работы");
            }
        }
    }
}
