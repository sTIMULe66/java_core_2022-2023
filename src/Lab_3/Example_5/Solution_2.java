/*
Напишите программу, в которой вычисляется сумма чисел,
удовлетворяющих таким критериям: при делении числа на 5 в остатке получается 2,
или при делении на 3 в остатке получается 1. Количество чисел в сумме
вводится пользователем. Программа отображает числа, которые
суммируются, и значение суммы. Предложите версии программы,
использующие разные операторы цикла.
 */

package Lab_3.Example_5;

import java.util.Scanner;

public class Solution_2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int n = in.nextInt();
        in.close();

        int sum = 0;
        int i = 0;

        while(i <= n){
            if((i % 5 == 2) || (i % 3 == 1)) {
                System.out.print(i + " ");
                sum = sum + i;
            }
            i++;
        }
        System.out.println("\n" + "Sum = " + sum);
    }
}
