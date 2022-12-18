/*
Напишите программу, в которой создается двумерный целочисленный
массив. Он заполняется случайными числами. Затем в этом массиве строи и
столбцы меняются местами: первая строка становится первым столбцом,
вторая строка становиться вторым столбцом и так далее. Например, если
исходный массив состоял из 3 строк и 5 столбцов, то в итоге получаем массив
из 5 строк и 3 столбцов.
 */

package Lab_4;

import java.util.Random;

public class Example_5 {
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
        int[][] array2 = new int[height][width];

        for (int i = 0; i < height; i++){
            for(int k = 0; k < width; k++) {
                array[k][i] = rand.nextInt(25);
            }
        }

        System.out.println("Исходный массив: ");
        for (int i = 0; i < height; i++){
            for(int k = 0; k < width; k++) {
                System.out.print(array[k][i] + "\t");
            }
            System.out.println("");
        }

        for (int i = 0; i < width; i++){
            for(int k = 0; k < height; k++) {
                array2[k][i] = array[i][k];
            }
        }

        System.out.println("Измененный массив: ");
        for (int i = 0; i < width; i++){
            for(int k = 0; k < height; k++) {
                System.out.print(array2[k][i] + "\t");
            }
            System.out.println("");
        }

    }
}
