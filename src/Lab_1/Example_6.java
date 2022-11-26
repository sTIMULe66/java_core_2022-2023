/*
Задание:
Напишите программу, в которой Пользователь вводит сначала фамилию,
затем имя, затем отчество. После ввода программа выводит сообщение
«Hello <фамилия, имя, отчество>»
 */

package Lab_1;
import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String firstName = in.nextLine();
        System.out.println("Введите имя: ");
        String name = in.nextLine();
        System.out.println("Введите отчество: ");
        String secondName = in.nextLine();
        in.close();

        System.out.println("Hello " + firstName + " " + name + " " + secondName);
    }
}
