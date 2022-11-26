/*
Задание:
Напишите программу, в которой Пользователь вводит имя и год рождения,
в программа отображает сообщение содержащее имя пользователя
и его возраст.
 */

package Lab_1;
import java.util.Scanner;

public class Example_11 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите год рождения: ");
        int bornYear = in.nextInt();
        System.out.println("Введите текущий год: ");
        int todayYear = in.nextInt();
        in.close();

        int age = todayYear - bornYear;
        System.out.println(name + " вам " + age + " года(лет)");
    }
}
