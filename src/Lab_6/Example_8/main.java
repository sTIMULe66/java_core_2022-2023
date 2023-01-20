package Lab_6.Example_8;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        in.close();

        int [] array = new int [size];
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            array[i] = rand.nextInt(10);
            System.out.println("array[" + i + "] = " + array[i]);
        }

        ex6_8 obj = new ex6_8();
        float crt = obj.mainMethod(array);
        System.out.println("CRT = " + crt);
    }

}
