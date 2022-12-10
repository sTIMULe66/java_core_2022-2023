/*
Напишите программу, в которой создается символьный массив из
10 элементов. Массив заполнить большими (прописными) буквами
английского алфавита. Буквы берутся подряд, но только согласные (то есть
гласные буквы ’ А ' , ' Е ' и ' I ' при присваивании значений элементам массива
нужно пропустить). Отобразите содержимое созданного массива в консольном
окне.
 */

package Lab_3.Example_8;

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
        mas[0] = 'B';
        mas[1] = 'C';
        mas[2] = 'D';
        mas[3] = 'F';
        mas[4] = 'G';
        mas[5] = 'H';
        mas[6] = 'J';
        mas[7] = 'K';
        mas[8] = 'L';
        mas[9] = 'M';

        System.out.println("Основной массив: ");
        for(int i=0; i < size; i++){
            System.out.print(mas[i] + " ");
        }
    }
}
