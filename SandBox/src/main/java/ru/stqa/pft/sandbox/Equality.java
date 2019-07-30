package ru.stqa.pft.sandbox;

public class Equality {

  public static void main(String[] args) {
    String s1 = "firefox";
    String s2 = new String(s1);

    System.out.println(s1 == s2);
    System.out.println(s1.equals(s2));

    String s3 = "firefox";
    String s4 = "fire" + "fox";

    System.out.println(s3 == s4);
    System.out.println(s3.equals(s4));

    String s5 = "firefox 2.0";
    String s6 = "fire" + Math.sqrt(4.0);

    System.out.println(s5 == s6);
    System.out.println(s5.equals(s6));

    //Итог урока: числа можно сравнивать == , но объекты всегда сравниваем через equals

  }
}
