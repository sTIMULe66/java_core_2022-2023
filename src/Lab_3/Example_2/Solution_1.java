/*
Напишите программу, в которой пользователю предлагается
ввести название дня недели. По введенному названию программа определяет
порядковый номер дня в неделе. Если пользователь вводит неправильное
название дня, программа выводит сообщение о том, что такого дня нет.
Предложите версию программы на основе вложенных условных операторов и
на основе оператора выбора switch.
 */

package Lab_3.Example_2;

import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String day = in.nextLine();
        in.close();

        switch (day) {
            case "Понедельник":
                System.out.println("Порядковый номер - 1");
                break;
            case "Вторник":
                System.out.println("Порядковый номер - 2");
                break;
            case "Среда":
                System.out.println("Порядковый номер - 3");
                break;
            case "Четверг":
                System.out.println("Порядковый номер - 4");
                break;
            case "Пятница":
                System.out.println("Порядковый номер - 5");
                break;
            case "Суббота":
                System.out.println("Порядковый номер - 6");
                break;
            case "Воскресенье":
                System.out.println("Порядковый номер - 7");
                break;
            default:
                System.out.println("Введены не корректрные данные!");
        }
    }
}
