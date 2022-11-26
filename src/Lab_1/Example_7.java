/*
Задание:
Напишите программу, в которой Пользователь вводит имя и возраст.
Программа отображает сообщение об имени и возрасте пользователя.
 */

package Lab_1;
import java.util.Scanner;

public class Example_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите возраст: ");
        int age = in.nextInt();
        in.close();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
    }
}
