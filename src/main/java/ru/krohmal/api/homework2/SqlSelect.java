  //    Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса,
  //    используя StringBuilder. Данные для фильтрации приведены ниже в виде json-строки.
  //    Если значение null, то параметр не должен попадать в запрос.
  //    Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}




package ru.krohmal.api.homework2;


  import java.io.BufferedReader;
  import java.io.FileReader;
  import java.io.IOException;

  public class SqlSelect {
      public static void main(String[] args) throws IOException {
          start();
      }

      public static void start() throws IOException {
          BufferedReader br = new BufferedReader(new FileReader("src/main/java/ru/krohmal/api/homework2/test.json"));
          StringBuilder sb = new StringBuilder();
          String str;
          while ((str = br.readLine()) != null) {
              str = str.replaceAll("[\\[{,}\\]:\"]+"," ");
              str = str.replaceAll("name","");
              str = str.replaceAll("country","");
              str = str.replaceAll("city","");
              str = str.replaceAll("age","");
              str = str.replaceAll("null","");
            sb.append("\n"+str);
          }
          System.out.println(sb);
          }
  }
