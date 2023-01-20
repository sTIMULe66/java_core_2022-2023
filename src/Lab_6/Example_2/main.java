package Lab_6.Example_2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int count;
        Scanner in = new Scanner(System.in);
        ex6_2 obj = new ex6_2();

        System.out.print("Введите количество шагов: ");
        count = in.nextInt();

        for (int i = 0; i < count; i++){
            System.out.println("Шаг №" + (i + 1));
            obj.OutMethod();
        }
    }
}
