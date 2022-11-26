/*
Задание:
Напишите программу, в которой по возрасту определяется год рождения.
 */

package Lab_1;
import java.util.Scanner;

public class Example_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваш возраст: ");
        int age = in.nextInt();
        System.out.println("Введите текущий год: ");
        int todayYear = in.nextInt();
        in.close();

        int bornYear = todayYear - age;
        System.out.println("Вы родились в " + bornYear + " году");
    }
}
