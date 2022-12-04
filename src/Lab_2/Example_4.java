/*
Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: число делится на 4, и при
этом оно не меньше 10.
 */

package Lab_2;
import java.util.Scanner;

public class Example_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();

        if (num % 4 == 0 & num > 10) {
            System.out.println("Число соответсвует условию");
        }
        else
            System.out.println("Число не соответсвует условию");
    }
}
