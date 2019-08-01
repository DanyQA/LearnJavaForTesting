package ru.stqa.pft.sandbox;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {

  public static void main(String[] args) {  //String[] args - создание массива
//Первый вариант записи
    /*    String[] langs = new String[4];
    langs[0] = "Java";
    langs[1] = "C#";
    langs[2] = "Python";
    langs[3] = "PHP";*/
//Второй вариант записи
    String[] langs = {"Java", "C#", "Python", "PHP"};

    for (String l : langs){
      System.out.println("I want learn " + l);
    }

//Списки

/*
    List<String> languages = new ArrayList<String>();  //Создание списка
    languages.add("Java");
    languages.add("C#");
    languages.add("Python");
*/

//Второй способ, наиболее удобный
    List<String> languages = Arrays.asList("Java", "C#", "Puthon", "PHP");

    for (String l : languages){
      System.out.println("Я хочу выучить " + l);
    }

    //Третий способ
    List<String> languages2 = Arrays.asList("Java", "C#", "Puthon", "PHP");

    for (int i = 0; i < languages2.size(); i++){
      System.out.println("Я хочу выучить " + languages2.get(i));
    }

  }

}
