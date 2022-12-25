package Lab_5.Example_6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое значение: ");
        int a = in.nextInt();
        System.out.print("Введите второе значение: ");
        int b = in.nextInt();
        in.close();

        System.out.println("\nИспользуемые конструкты:");
        ex6 t1 = new ex6();
        ex6 t2 = new ex6(a);
        ex6 t3 = new ex6(a,b);

        System.out.println("\nДо использования методов:");
        System.out.println("Содержимое первого объекта:");
        t1.m2();
        System.out.println("Содержимое второго объекта:");
        t2.m2();
        System.out.println("Содержимое третьего объекта:");
        t3.m2();

        System.out.println("\nПосле использования методов:");
        t1.m1(a,b);
        t2.m1(b);
        System.out.println("Содержимое первого объекта:");
        t1.m2();
        System.out.println("Содержимое второго объекта:");
        t2.m2();
    }
}
