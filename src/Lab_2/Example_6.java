/*
Напишите программу, которая проверяет, сколько тысяч во введенном
пользователем числе (определяется четвертая цифра справа в десятичном
представлении числа)
 */

package Lab_2;
import java.util.Scanner;

public class Example_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int num = in.nextInt();
        in.close();

        if (num / 1000 > 0) {
            System.out.println("В числе " + num / 1000 + " тысяч(тысячи)");
        }
        else {
            System.out.println("Число меньше тысячи");
        }
    }
}
