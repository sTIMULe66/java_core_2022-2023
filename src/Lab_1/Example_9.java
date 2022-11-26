/*
Задание:
Напишите программу, в которой пользователю предлагается ввести название
месяца и количество дней в этом месяце. Программа выводит сообщение о том,
что соответствующий месяц содержит указанное количество дней
 */

package Lab_1;
import java.util.Scanner;

public class Example_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();
        System.out.println("Введите количество дней в этом месяце: ");
        int days = in.nextInt();
        in.close();

        System.out.println("В месяце " + month + " " + days + " дней");
    }
}
