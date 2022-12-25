package Lab_5.Example_3;

import java.util.Scanner;

class ex3 {
    int v1;
    int v2;

    ex3(){
        System.out.println("Выбран конструкт без передачи аргументов");
        v1 = 0;
        v2 = 0;
    }
    ex3(int tmp1){
        System.out.println("Выбран конструкт с передачей одного аргумента");
        v1 = tmp1;
        v2 = 0;
    }
    ex3(int tmp1, int tmp2){
        System.out.println("Выбран конструкт с передачей двух аргументов");
        v1 = tmp1;
        v2 = tmp2;
    }
}
