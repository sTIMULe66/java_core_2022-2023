/*
Напишите программу, которая выводит последовательность чисел
Фибоначчи. Первые два числа в этой последовательности равны 1, а каждое
следующее число равно сумме двух предыдущих (получается последовательность
1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89 и так далее). Количество чисел
в последовательности вводится пользователем. Предложите версии
программы, использующие разные операторы цикла.
 */

package Lab_3.Example_3;

import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество выводимых чисел в последовательности: ");
        int n = in.nextInt();
        in.close();

        int a = 1;
        int b = 1;
        int c = 0;
        int i = 0;

        do{
            System.out.print(a + "  ");
            c = a + b;
            a = b;
            b = c;
            i++;
        }
        while(i <= n);
    }
}