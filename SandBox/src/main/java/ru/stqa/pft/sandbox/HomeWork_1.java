package ru.stqa.pft.sandbox;

public class HomeWork_1 {

  public static void main(String[] args) {

    Point2(9,6,8,4);

    Point L = new Point(2,5,4,6);
    System.out.println("Расстояние между точками = " + L.area());
  }

  public static void Point2 (double z1, double z2,double q1, double q2){
    System.out.println("Расстояние между точками ver2 = " + Math.sqrt((z2 - z1)*(z2 - z1) + (q2 - q1)*(q2 - q1)));
  }

}