package Lab_6.Example_3;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        int a, b, c, d;
        Random rand = new Random();
        int [] array = new int[size];

        a = rand.nextInt(50);
        b = rand.nextInt(50);
        c = rand.nextInt(50);
        d = rand.nextInt(50);

        System.out.println("Значение переменных:");
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d);
        for(int i = 0; i < size; i++){
            array[i] = rand.nextInt(50);
            System.out.println("array[" + i + "] = " + array[i]);
        }

        ex6_3 obj_1 = new ex6_3();
        ex6_3 obj_2 = new ex6_3();
        ex6_3 obj_3 = new ex6_3();
        ex6_3 obj_4 = new ex6_3();
        ex6_3 obj_5 = new ex6_3();

        System.out.println("Вывод при передаче 1 чисел:");
        obj_1.mainMethod(a);
        obj_1.outMethod();

        System.out.println("Вывод при передаче 2 чисел:");
        obj_2.mainMethod(a,b);
        obj_2.outMethod();

        System.out.println("Вывод при передаче 3 чисел:");
        obj_3.mainMethod(a,b,c);
        obj_3.outMethod();

        System.out.println("Вывод при передаче 4 чисел:");
        obj_4.mainMethod(a,b,c,d);
        obj_4.outMethod();

        System.out.println("Вывод при передаче array[]:");
        obj_5.mainMethod(array);
        obj_5.outMethod();

    }
}
