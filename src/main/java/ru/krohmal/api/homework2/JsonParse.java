package ru.krohmal.api.homework2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JsonParse {
    public static void main(String[] args) throws IOException {
        start();
    }
    public static void start() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/main/java/ru/krohmal/api/homework2/task3.json"));
        StringBuilder sb = new StringBuilder();
        String str;
        while ((str = br.readLine()) != null) {
          sb.append(str);
        }
        String s;
        s = sb.toString();
        s = s.replaceAll("[\\[{,}\\]:\"]+"," ");
        s = s.replaceAll("фамилия","Студент ");
        s = s.replaceAll("оценка","получил ");
        s = s.replaceAll("предмет","по предмету ");
        s = s.replaceAll("ика","ика.\n");

        System.out.println(s);

    }

    }

