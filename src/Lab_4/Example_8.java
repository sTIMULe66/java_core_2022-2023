/*
Напишите программу «Шифр Цезаря», которая зашифровывает
введенный текст. Используете кодовую таблицу символов. При запуске
программы в консоль необходимо вывести сообщение: «Введите текст для
шифрования», после ввода текста, появляется сообщение: «Введите ключ».
После того как введены все данные, необходимо вывести преобразованную
строку с сообщением «Текст после преобразования : ». Далее необходимо
задать вопрос пользователю: «Выполнить обратное преобразование? (y/n)»,
если пользователь вводит «y», тогда выполнить обратное преобразование.
Если пользователь вводит «n», того программа выводит сообщение «До
свидания!». Если пользователь вводит что-то другое, отличное от «y» или «n»,
то программа ему выводит сообщение: «Введите корректный ответ».

 */

package Lab_4;

import java.util.Scanner;

public class Example_8 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст для шифрования: ");
        String message = in.nextLine();
        System.out.println("Введите ключ: ");
        int key = in.nextInt();

        char[] arrayToConvert = message.toCharArray();
        long[] arrayInt = new long[arrayToConvert.length];
        char[] arrayResult = new char[arrayToConvert.length];

        for(int i = 0; i < arrayToConvert.length; i++){
            arrayInt[i] = arrayToConvert[i] + key;
            arrayResult[i] = (char) arrayInt[i];
            }

        message = new String(arrayResult);
        System.out.println("Текст после преобразования:\n" + message);

        System.out.println("Выполнить обратное преобразование? (y/n)");
        char next;
        do{
            next = in.next().charAt(0);
            switch (next){
                case 'y':
                    break;
                case 'n':
                    System.out.println("До свидания!");
                    return;
                default:
                    System.out.println("Введите корректный ответ!");
            }
        }
        while (next != 'y');
        in.close();

        arrayToConvert = message.toCharArray();
        arrayInt = new long[arrayToConvert.length];
        arrayResult = new char[arrayToConvert.length];

        for(int i = 0; i < arrayToConvert.length; i++){
            arrayInt[i] = arrayToConvert[i] - key;
            arrayResult[i] = (char) arrayInt[i];
        }

        message = new String(arrayResult);
        System.out.println("Текст после обратного преобразования:\n" + message);

    }
}
