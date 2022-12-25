package Lab_5.Example_6;

import java.util.Scanner;

class ex6 {
    private int min;
    private int max;

    ex6(){
        System.out.println("Выбран конструкт без передачи аргументов");
        min = 0;
        max = 0;
    }

    ex6(int a){
        System.out.println("Выбран конструкт с передачей одного аргумента");
        if(a > 0){
            max = a;
            min = 0;
        }
        else{
            max = 0;
            min = a;
        }
    }

    ex6(int a, int b){
        System.out.println("Выбран конструкт с передачей двух аргументов");
        if(a > b){
            min = b;
            max = a;
        }
        else{
            min = a;
            max = b;
        }
    }

    public void m1(int a){
        if(a > max){
            min = max;
            max = a;
        }
        if(a < min){
            min = a;
        }
    }

    public void m1(int a, int b){
        if(a > b){
            min = b;
            max = a;
        }
        else{
            min = a;
            max = b;
        }
    }

    public void m2(){
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
