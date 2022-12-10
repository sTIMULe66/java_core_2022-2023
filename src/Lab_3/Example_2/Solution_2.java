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

public class Solution_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название дня недели: ");
        String day = in.nextLine();
        in.close();

        if (day.equals("Понедельник")) {
            System.out.println("Порядковый номер - 1");
        }
        else if (day.equals("Вторник")) {
            System.out.println("Порядковый номер - 2");
        }
        else if (day.equals("Среда")) {
            System.out.println("Порядковый номер - 3");
        }
        else if (day.equals("Четверг")) {
            System.out.println("Порядковый номер - 4");
        }
        else if (day.equals("Пятница")){
            System.out.println("Порядковый номер - 5");
        }
        else if (day.equals("Суббота")) {
            System.out.println("Порядковый номер - 6");
        }
        else if (day.equals("Воскресенье")) {
            System.out.println("Порядковый номер - 7");
        }
        else {
            System.out.println("Введены не корректрные данные!");
        }
    }
}
