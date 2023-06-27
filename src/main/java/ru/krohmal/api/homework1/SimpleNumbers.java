package ru.krohmal.api.homework1;

public class SimpleNumbers {
    public static void main(String[] args) {
        start();
    }

    public static void start() {
        System.out.println("Задача простые числа: ");
        System.out.print("Введите число до которого нужно вывести простые числа: ");
        int n = Integer.parseInt(Menu.sc.nextLine());
        for (int i=2;i<n;i++){
            if(checkSimple(i))
                System.out.printf("%d ",i);
        }
    }

    public static boolean checkSimple(int i){
        if (i<=1)
            return false;
        else if (i <=3)
            return true;
        else if (i%2==0 || i %3 ==0)
            return false;
        int n = 5;
        while (n*n <=i){
            if (i % n ==0 || i % (n+2) == 0)
                return false;
            n=n+6;
        }
        return true;
    }
}




