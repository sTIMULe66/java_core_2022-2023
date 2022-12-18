/*
Напишите программу, которая выводит в консольное окно
прямоугольный треугольник
 */

package Lab_4;

import java.util.Random;

public class Example_2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int length;

        do {
           length = rand.nextInt(12);
        }
        while(length < 2);

        for (int i = 0; i < length; i++){
            for (int k = 0; k < (length - i); k++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
