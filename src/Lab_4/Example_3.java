/*
Напишите программу, в которой создается двумерный массив,
который выводи прямоугольник из цифр 2
 */

package Lab_4;

import java.util.Random;

public class Example_3 {
    public static void main(String[] args) {
        int width;
        int height;
        Random rand = new Random();

        do {
            width = rand.nextInt(12);
            height = rand.nextInt(12);
        }
        while((width < 2) || (height < 2));

        int[][] array = new int[width][height];

        for (int i = 0; i < height; i++){
            for(int k = 0; k < width; k++) {
                array[k][i] = 2;
            }
        }

        for (int i = 0; i < height; i++){
            for(int k = 0; k < width; k++) {
                System.out.print(array[k][i]);
            }
            System.out.println("");
        }
    }
}
