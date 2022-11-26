/*
Задание:
https://acm.timus.ru/problem.aspx?space=1&num=1293
 */

package Timus.task_1293;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();

        int s = n * (a * b) *2;

        System.out.println(s);
    }
}
