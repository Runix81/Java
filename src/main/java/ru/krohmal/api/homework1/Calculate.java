
package ru.krohmal.api.homework1;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.Objects;

public class Calculate {
    public static void main(String[] args) {


        LogFile(start());
    }

    public static Formatter start() {
        String[] lst = new String[]{"+", "-", "*", "/"};
        System.out.print("Введите первое число: ");
        double x = Double.parseDouble(Menu.sc.nextLine());
        System.out.print("Выберите действие: ");
        String[] action = new String[]{Menu.sc.nextLine()};
        System.out.print("Введите второе число: ");
        double y = Double.parseDouble(Menu.sc.nextLine());
        double res;
        Formatter s = new Formatter();
        if (action[0].equals(lst[0])) {
            res = x + y;
            s.format("%.2f %s %.2f = %.2f\n", x, action[0], y, res);
        } else if (action[0].equals(lst[1])) {
            res = x - y;
            s.format("%.2f %s %.2f = %.2f\n", x, action[0], y, res);
        } else if (action[0].equals(lst[2])) {
            res = x * y;
            s.format("%.2f %s %.2f = %.2f\n", x, action[0], y, res);
        } else if (action[0].equals(lst[3])) {
            res = x / y;
            s.format("%.2f %s %.2f = %.2f\n", x, action[0], y, res);
        }
        System.out.println(s);
        return s;
    }

    public static void LogFile(Formatter b) {
        String text = b.toString();
        File file = new File("log.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(file,true);
            fr.write(text);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                Objects.requireNonNull(fr).close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        }

}
