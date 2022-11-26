/*
Задание:
Напишите программу для вычисления суммы двух чисел.
Оба числа вводятся пользователем.
Для вычисления суммы используйте оператор +.
 */

package Lab_1;
import java.util.Scanner;

public class Example_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float num1 = in.nextFloat();
        System.out.println("Введите второе число: ");
        float num2 = in.nextFloat();
        in.close();

        float sum = num1 + num2;
        System.out.println("Сумма чисел равна " + sum);
    }
}
