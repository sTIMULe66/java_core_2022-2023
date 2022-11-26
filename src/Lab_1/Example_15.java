/*
Задание:
Напишите программу, в которой Пользователь вводит два числа,
а программой вычисляется и отображается сумма и разность этих чисел.
 */

package Lab_1;

import java.util.Scanner;

public class Example_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float num1 = in.nextFloat();
        System.out.println("Введите второе число: ");
        float num2 = in.nextFloat();
        in.close();

        float sum = num1 + num2;
        float raz = num1 - num2;

        System.out.println("Сумма чисел равна " + sum);
        System.out.println("Разность чисел равна " + raz);
    }
}

