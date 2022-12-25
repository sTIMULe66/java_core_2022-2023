package Lab_5.Example_5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = in.nextInt();

        System.out.println("\nИспользуемые конструкты:");
        ex5 t1 = new ex5();
        ex5 t2 = new ex5(a);

        System.out.println("\nСодержимое первого объекта:");
        t1.m2();
        System.out.println("Содержимое второго объекта:");
        t2.m2();

        System.out.println("\nПрименение методов на объекты:");
        t1.m1(a);
        t2.m1();

        System.out.println("\nСодержимое первого объекта:");
        t1.m2();
        System.out.println("Содержимое второго объекта:");
        t2.m2();
    }
}
