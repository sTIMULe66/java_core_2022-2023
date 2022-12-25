package Lab_5.Example_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ex2 test = new ex2();
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первый символ: ");
        test.v1 = in.nextLine().charAt(0);
        System.out.print("Введите второй символ: ");
        test.v2 = in.nextLine().charAt(0);
        in.close();

        System.out.println("Результат работы программы: ");
        test.m1();
    }
}
