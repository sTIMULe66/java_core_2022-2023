/*
Напишите программу, в которой создается двумерный массив,
который выводит прямоугольный треугольник
 */

package Lab_4;

import java.util.Random;

public class Example_4 {
    public static void main(String[] args) {
        int length;
        Random rand = new Random();

        do {
            length = rand.nextInt(12);
        }
        while(length < 2);

        int[][] array = new int[length][length];

        for (int i = 0; i < length; i++){
            for(int k = 0; k < length; k++) {
                array[k][i] = 2;
            }
        }

        for (int i = 0; i < length; i++){
            for (int k = 0; k < (length - i); k++){
                System.out.print(array[k][i]);
            }
            System.out.println("");
        }
    }
}
