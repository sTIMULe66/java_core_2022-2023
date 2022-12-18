/*
Напишите программу, в которой создается двумерный числовой массив
и этот массив заполняется «змейкой»: сначала первая строка (слева направо),
затем последний столбец (снизу вверх), вторая строка (слева направо) и так
далее.
 */

package Lab_4;

import java.util.Random;

public class Example_7 {
    public static void main(String[] args) {

        int length;
        Random rand = new Random();

        do {
            length = rand.nextInt(5);
        }
        while(length < 2);

        int[][] array = new int[length][length];
        int y = array[0].length-1;
        System.out.println("Исходный массив состоит из " + array.length + " строк и " + array[0].length + " столбцов");
            for(int i = 0; i < (array.length); i++){
                System.out.println("Шаг №" + i + ":");
                System.out.println("Вывод результата в виде элементов:");
                System.out.println("---Заполнение элементов строки---");
                for(int k = 0; k < (array[i].length-i); k++) {
                    array[i][k] = rand.nextInt(99);
                    System.out.println("Array["+i+"]"+"["+k+"]="+array[i][k] + "\t");
                    }
                System.out.println("---Заполнение элементов столбца---");
                for (int x = array.length-1; x > i; x--) {
                    array[x][y] = rand.nextInt(99);
                    System.out.println("Array["+x+"]"+"["+y+"]="+array[x][y] + "\t");
                }
                y--;
                System.out.println("Вывод результата в виде массива:");
                for(int o = 0; o < array.length; o++){
                    for(int l = 0; l < array[o].length; l++) {
                        System.out.print(array[o][l] + "\t");
                    }
                    System.out.println("");
                }
            System.out.println("");
            }
   }
}
