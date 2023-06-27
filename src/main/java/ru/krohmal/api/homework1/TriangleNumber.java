package ru.krohmal.api.homework1;

public class TriangleNumber {
        public static void main(String[] args) {
                start();
        }
        public static void start() {
        System.out.println("Задача треугольное число: ");
        System.out.print("Введите число n: ");
        int n = Integer.parseInt(Menu.sc.nextLine());
        int res = n*(n+1)/2;
        System.out.printf("Треугольное число для числа %d равно - %d\n",n,res);
        System.out.println("");
    }
}