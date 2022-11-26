/*
Задание:
Напишите программу, в которой по году рождения определяется возраст пользователя.
 */

package Lab_1;
import java.util.Scanner;

public class Example_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите год рождения: ");
        int bornYear = in.nextInt();
        System.out.println("Введите текущий год: ");
        int todayYear = in.nextInt();
        in.close();

        int age = todayYear - bornYear;
        System.out.println("Возраст: " + age);
    }
}
