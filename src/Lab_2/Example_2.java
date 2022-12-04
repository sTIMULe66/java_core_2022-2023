/*
Напишите программу, которая проверяет, делится ли введенное
Пользователем число на 3.
 */

package Lab_2;
import java.util.Scanner;

public class Example_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();

        if (num % 3 == 0) {
            System.out.println("Число делится на 3 без остатка");
        }
        else {
            System.out.println("Число не делится на 3 без остатка");
        }
    }
}
