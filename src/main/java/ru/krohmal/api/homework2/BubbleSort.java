package ru.krohmal.api.homework2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Objects;
import java.util.Random;


public class BubbleSort {
    public static void main(String[] args) {
        start();

    }
    public static void start(){
        Random random = new Random();
        int size = random.nextInt(10,21);
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(-9,10);
        }
        Formatter s1 = new Formatter();
        s1.format(Arrays.toString(arr)+"\n");
        System.out.print(s1);
        LogFile(s1);
        boolean sort = false;
        int buf;
        while (!sort){
            sort = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    sort = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
                
            }
        }
        Formatter s2 = new Formatter();
        s2.format(Arrays.toString(arr)+"\n");
        System.out.println(s2);
        LogFile(s2);
    }
    public static void LogFile(Formatter s) {
        String text = s.toString();
        File file = new File("log1.txt");
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
