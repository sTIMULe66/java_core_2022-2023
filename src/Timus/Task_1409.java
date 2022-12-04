package Timus;
import java.util.Scanner;
public class Task_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int g = in.nextInt();
        int l = in.nextInt();
        in.close();

        System.out.println((l - 1) + " " + (g - 1));
    }
}
