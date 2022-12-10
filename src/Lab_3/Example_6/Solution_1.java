/*
Напишите программу, в которой создается одномерный числовой
массив и заполняется числами, которые при делении на 5 дают в остатке 2
(числа 2, 7,12,17 и так далее). Размер массива вводится пользователем.
Предусмотреть обработку ошибки, связанной с вводом некорректного
значения.
 */

package Lab_3.Example_6;

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

        int[] mas = new int [size];
        Random rand = new Random();

        System.out.println("Элементы созданного массива: ");
        for(int i=0; i < mas.length; i++){
           do{
               mas[i] = rand.nextInt(100);
           }
           while(mas[i] % 5 != 2);
           System.out.print(mas[i] + " ");
        }
    }
}
