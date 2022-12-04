package Timus;
import java.util.Scanner;
public class Task_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int f = in.nextInt();
        in.close();

        int tasks = 12 - f;
        int time = tasks * 45;

        if (time <= 260) {
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
