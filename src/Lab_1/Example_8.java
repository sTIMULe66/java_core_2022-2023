/*
Задание:
Напишите программу, в которой Пользователь последовательно вводит название
текущего дня недели, название месяца и дату (номер дня в месяце).
Программа выводит сообщение о сегодняшней дате (день недели, дата, месяц).
 */

package Lab_1;
import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название текущего дня недели: ");
        String dateName = in.nextLine();
        System.out.println("Введите название месяца: ");
        String month = in.nextLine();
        System.out.println("Введите дату (номер дня в месяце): ");
        int date = in.nextInt();
        in.close();

        System.out.println("Сегодня: " + dateName + " " + date + " " + month);
    }
}
