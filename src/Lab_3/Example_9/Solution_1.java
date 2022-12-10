/*
Напишите программу, в которой создается массив и заполняется
случайными числами. Массив отображается в консольном окне. В этом
массиве необходимо определить элемент с минимальным значением. В
частности, программа должна вывести значение элемента с минимальным
значением и индекс этого элемента. Если элементов с минимальным
значением несколько, должны быть выведены индексы всех этих элементов.
 */

package Lab_3.Example_9;
import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

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
           mas[i] = rand.nextInt(10);
           System.out.print(mas[i] + " ");
        }

        Arrays.sort(mas);
        System.out.println("\nОтсортированный массив: ");
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }

        System.out.println("\nНаименьшие элементы массива: ");
        System.out.println("mas[0]=" + mas[0]);
        for(int i = 1; i < mas.length; i++){
            if(mas[i] == mas[0]){
                System.out.println("mas["+i+"]=" + mas[i]);
            }
        }
    }
}
