/*
Напишите программу, в которой пользователем вводится два
целых числа. Программа выводит все целые числа — начиная с наименьшего
(из двух введенных чисел) и заканчивая наибольшим (из двух введенных
чисел). Предложите разные версии программы (с использованием разных
операторов цикла).
 */

package Lab_3.Example_4;

import java.util.Scanner;

public class Solution_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите два числа: ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        in.close();

        do {
            System.out.print(n1 + " ");
            n1++;
        }
        while (n1 <= n2);
    }
}
