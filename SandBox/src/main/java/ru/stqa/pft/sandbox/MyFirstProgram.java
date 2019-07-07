package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("world");
        hello("user");
        hello("Dany");

        Point2(9,6,8,4);

        Square s = new Square(5);
        System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

        Rectangle r = new Rectangle(4, 6);
        System.out.println("Площадь прямоугольника со сторонами " + r.a + " и " + r.b + " = " + r.area());

        Point L = new Point(2,5,4,6);
        System.out.println("Расстояние между точками = " + L.area());
    }

    public static void hello(String somebody) {
        System.out.println("Hello, " + somebody + "!");
    }

    public static void Point2 (double z1, double z2,double q1, double q2){
        System.out.println("Расстояние между точками ver2 = " + Math.sqrt((z2 - z1)*(z2 - z1) + (q2 - q1)*(q2 - q1)));
    }

}