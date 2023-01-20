package Lab_6.Example_6;

import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        System.out.print("size = ");
        int size = in.nextInt();
        in.close();

        int [] array = new int [size];
        Random rand = new Random();
        for(int i = 0; i < size; i++){
            array[i] = rand.nextInt(50);
            System.out.println("array[" + i + "] = " + array[i]);
        }
        ex6_6 obj = new ex6_6();
        int new_array[] = obj.mainMethod(array, n);

        for(int i = 0; i < new_array.length; i++){
        System.out.println("new_array[" + i + "] = " + new_array[i]);
        }
    }
}
