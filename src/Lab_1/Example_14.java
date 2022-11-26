/*
Задание:
Напишите программу, в которой пользователь вводит число,
а программой отображается последовательность из четырех чисел:
число, на единицу меньше введённого, введенное число и число,
на единицу больше введенного.
Четвертое число должно быть квадратом суммы первых трех чисел.
 */

package Lab_1;
import java.util.Scanner;

public class Example_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();

        int num1 = num - 1;
        int num2 = num + 1;
        int num3 = (num1 + num + num2) * (num1 + num + num2);

        System.out.println(num1 + "    " + num + "     " + num2 + "     " + num3);
    }
}
