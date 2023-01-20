package Lab_6.Example_4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("i = ");
        int i = in.nextInt();
        ex6_4 obj = new ex6_4();
        obj.mainMethod(i);
    }
}
