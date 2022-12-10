/*
Напишите программу, в которой создается целочисленный
массив, заполняется случайными числами и после этого значения элементов в
массиве сортируются в порядке убывания значений.
 */

package Lab_3.Example_10;

import java.util.Random;
import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        while(size < 0){
            System.out.println("Введите корректное значение: ");
            size = in.nextInt();
        }
        in.close();

        int[] mas = new int[size];
        Random rand = new Random();

        System.out.println("Элементы созданного массива: ");
        for(int i = 0; i < mas.length; i++){
            mas[i] = rand.nextInt(100);
            System.out.print(mas[i] + " ");
        }

        for(int i = mas.length - 1; i > 0; i--){
            for(int k = 0; k < i; k++){
                if(mas[k] < mas[k+1]){
                    int temp = mas[k];
                    mas[k] = mas[k+1];
                    mas[k+1] = temp;
                }
            }
        }
        System.out.println("\nОтсортированный массив: ");
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
