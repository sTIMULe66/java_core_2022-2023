/*
Напишите программу, в которой создается одномерный
символьный массив из 10 элементов. Массив заполняется буквами «через
одну», начиная с буквы ' а ': то есть массив заполняется буквами ' а ' , ' с ' , ' е ' ,
' д ' и так далее. Отобразите массив в консольном окне в прямом и обратном
порядке. Размер массива задается переменной
 */

package Lab_3.Example_7;


import java.util.Scanner;

public class Solution_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива (от 1 до 10): ");
        int size = in.nextInt();
        while ((size < 0) || (size > 10)) {
            System.out.println("Введите корректное значение: ");
            size = in.nextInt();
        }
        in.close();

        char[] mas = new char[10];
        mas[0] = 'a';
        mas[1] = 'c';
        mas[2] = 'e';
        mas[3] = 'g';
        mas[4] = 'i';
        mas[5] = 'k';
        mas[6] = 'm';
        mas[7] = 'o';
        mas[8] = 'q';
        mas[9] = 's';

        System.out.println("Основной массив: ");
        for(int i=0; i < size; i++){
            System.out.print(mas[i] + " ");
        }
        System.out.println("\nОбратный массив: ");
        for(int i = size - 1; i >= 0 ; i--){
            System.out.print(mas[i] + " ");
        }
    }
}
