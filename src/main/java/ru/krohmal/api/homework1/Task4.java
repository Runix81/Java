package ru.krohmal.api.homework1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4 {
    public static void main(String[] args) throws IOException {
        start();
    }
        public static void start() throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите текст: ");
            String say = br.readLine();
            System.out.printf("Вы ввели: %s", say);

    }
}
