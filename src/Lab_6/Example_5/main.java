package Lab_6.Example_5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("n = ");
        int n = in.nextInt();
        ex6_5 obj = new ex6_5();
        obj.mainMethod(n);
    }
}
