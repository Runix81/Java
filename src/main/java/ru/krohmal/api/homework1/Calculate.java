
package ru.krohmal.api.homework1;



public class Calculate {
    public static void main(String[] args) {

        start();
    }

    public static void start() {
        String[] lst = new String[]{"+", "-", "*", "/"};
        System.out.print("Введите первое число: ");
        double x = Double.parseDouble(Menu.sc.nextLine());
        System.out.print("Выберите действие: ");
        String[] action = new String[]{Menu.sc.nextLine()};
        System.out.print("Введите второе число: ");
        double y = Double.parseDouble(Menu.sc.nextLine());
        double res;
        if (action[0].equals(lst[0])) {
            res = x + y;
            System.out.printf("%.2f %s %.2f = %.2f\n", x, action[0], y, res);
        } else if (action[0].equals(lst[1])) {
            res = x - y;
            System.out.printf("%.2f %s %.2f = %.2f\n", x, action[0], y, res);
        } else if (action[0].equals(lst[2])) {
            res = x * y;
            System.out.printf("%.2f %s %.2f = %.2f\n", x, action[0], y, res);
        } else if (action[0].equals(lst[3])) {
            res = x / y;
            System.out.printf("%.2f %s %.2f = %.2f\n", x, action[0], y, res);
        }
    }
}