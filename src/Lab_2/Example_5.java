/*
Напишите программу, которая проверяет, попадает ли введение
пользователем число в диапазон от 5 до 10 включительно.
 */

package Lab_2;
import java.util.Scanner;

public class Example_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();

        if (num >= 5 & num <= 10) {
            System.out.println("Число попадает в диапазон");
        }
        else {
            System.out.println("Число не попадает в диапазон");
        }
    }
}
