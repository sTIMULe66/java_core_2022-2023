/*
Задание:
https://acm.timus.ru/problem.aspx?space=1&num=1000
 */

package Timus.task_1000;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        int c = a + b;

        System.out.println(c);
    }
}
