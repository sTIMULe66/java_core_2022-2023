/*
Напишите программу, которая выводить в консольное окно
прямоугольник, размеры сторон которого, ширина: 23 колонки,
высота: 11 строк.
 */

package Lab_4;

public class Example_1 {
    public static void main(String[] args) {
        int width = 23;
        int height = 11;

        for (int i = 0; i < height; i++){
            for(int k = 0; k < width; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
