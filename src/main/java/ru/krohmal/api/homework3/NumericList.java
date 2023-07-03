/*
        Пусть дан произвольный список целых чисел.

        1) Нужно удалить из него чётные числа
        2) Найти минимальное значение
        3) Найти максимальное значение
        4) Найти среднее значение
*/

package ru.krohmal.api.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class NumericList {
    public static void main(String[] args) throws IOException {
        startMenu();
    }

    public static void startMenu() {
        int numMenu = 0;
        Random random = new Random();
        boolean f = true;
        ArrayList<Integer> myList = new ArrayList<>();
        int size = random.nextInt(10, 20);
        for (int i = 0; i < size; i++){
            myList.add(random.nextInt(-15,16));
        }
        while (f) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Меню:\nНажмите 1 удаления четных чисел из списка\nНажмите 2 что бы найти минимальное значение\nНажмите 3 что бы найти максимальное значение\nНажмите 4 что бы найти среднее значение\nНажмите 0 для выхода\n");
            boolean m = true;
            while (m) {
                try {
                    numMenu = Integer.parseInt(br.readLine());
                    m = false;
                } catch (Exception e) {
                    System.out.print("Вы ввели не число, попробуйте снова!");
                }
            }
            if (numMenu == 1) {
                System.out.println(myList);
                for (int j = 0; j < myList.size(); j++) {
                    if (myList.get(j)%2==0){
                        myList.remove(myList.get(j));
                        j--;
                    }
                }
                System.out.println("");
                System.out.println(myList);

            } else if (numMenu == 2) {
                Collections.sort(myList);
                System.out.println(myList);
                System.out.println(myList.get(0));
            } else if (numMenu == 3) {
                Collections.sort(myList);
                System.out.println(myList);
                System.out.println(myList.get(myList.size()-1));
            } else if (numMenu == 4) {
                System.out.println(myList);
                double res = 0;
                for (Integer integer : myList) {
                    res += integer;
                }
                res /= myList.size();
                System.out.printf("%.2f\n",res);
            } else if (numMenu == 0) {
                f = false;
                System.out.println("Завершение работы");
            }
        }
    }
}

