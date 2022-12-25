package Lab_5.Example_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите символ: ");
        char a = in.nextLine().charAt(0);
        System.out.print("Введите целочисленное число: ");
        int b = in.nextInt();
        System.out.print("Введите число с плавающей точкой: ");
        double c = in.nextDouble();
        in.close();

        System.out.println("Результат работы программы:");
        ex4 t1 = new ex4();
        System.out.println("v1 = " + t1.v1);
        System.out.println("v2 = " + t1.v2);

        ex4 t2 = new ex4(a);
        System.out.println("v1 = " + t2.v1);
        System.out.println("v2 = " + t2.v2);

        ex4 t3 = new ex4(b);
        System.out.println("v1 = " + t3.v1);
        System.out.println("v2 = " + t3.v2);

        ex4 t4 = new ex4(a,b);
        System.out.println("v1 = " + t4.v1);
        System.out.println("v2 = " + t4.v2);

        ex4 t5 = new ex4(c);
        System.out.println("v1 = " + t5.v1);
        System.out.println("v2 = " + t5.v2);
    }
}
