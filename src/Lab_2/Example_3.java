/*
 Напишите программу, которая проверяет, удовлетворяет ли введенное
пользователем число следующим критериям: при делении на 5 в остатке
получается 2, а при делении на 7 в остатке получается 1.
 */

package Lab_2;
import java.util.Scanner;

public class Example_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();

        if (num % 5 == 2) {
            System.out.println("При делении числа на 5 в остатке получается 2");
        }
        else if (num % 7 == 1) {
            System.out.println("При делении числа на 7 в остатке получается 1");
        }
        else {
            System.out.println("Число не удовлетворяет ни одному условию");
        }
    }
}
