/*
Напишите программу, в которой создается и инициализируется
двумерный числовой массив. Затем из этого массива удаляется строка и
столбец (создается новый массив, в котором по сравнению с исходным
удалена одна строка и один столбец). Индекс удаляемой строки и индекс
удаляемого столбца определяется с помощью генератора случайных чисел.
 */

package Lab_4;

import java.util.Random;

public class Example_6 {
    public static void main(String[] args) {

        int width;
        int height;
        Random rand = new Random();

        do {
            width = rand.nextInt(8);
            height = rand.nextInt(8);
        }
        while((width < 3) || (height < 3));

        int[][] array = new int[height][width];
        int[][] array2 = new int[height-1][width-1];

        for (int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++) {
                array[i][k] = rand.nextInt(25);
            }
        }

        System.out.println("Исходный массив: ");
        for (int i = 0; i < array.length; i++){
            for(int k = 0; k < array[i].length; k++) {
                System.out.print(array[i][k] + "\t");
            }
            System.out.println("");
        }

        int del_string = rand.nextInt(width);
        int del_column= rand.nextInt(height);
        System.out.println("Из массива будет удалена строка с индексом [" + del_string + "] и столбец с индексом [" + del_column + "]");

        int u = 0;
        int j = 0;

        for (int i = 0; i < array.length; i++){
            if(i != del_string) {
                for (int k = 0; k < array[i].length; k++) {
                    if (k != del_column) {
                        array2[u][j] = array[i][k];
                        j++;
                    }
                }
            u++;
            j=0;
            }
        }

        System.out.println("Измененный массив: ");
        for (int i = 0; i < array2.length; i++){
            for(int k = 0; k < array2[i].length; k++) {
                System.out.print(array2[i][k] + "\t");
            }
            System.out.println("");
        }


    }
}
