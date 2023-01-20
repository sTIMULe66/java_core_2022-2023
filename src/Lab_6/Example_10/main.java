package Lab_6.Example_10;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int a, b, c, d, e;
        Random rand = new Random();

        a = rand.nextInt(50);
        b = rand.nextInt(50);
        c = rand.nextInt(50);
        d = rand.nextInt(50);
        e = rand.nextInt(50);

        System.out.println("Значение переменных:");
        System.out.println("a = " + a + "\nb = " + b + "\nc = " + c + "\nd = " + d + "\ne = " + e);

        ex6_10 obj_1 = new ex6_10();
        ex6_10 obj_2 = new ex6_10();
        ex6_10 obj_3 = new ex6_10();
        ex6_10 obj_4 = new ex6_10();

        System.out.println("Вывод при передаче 2 чисел:");
        int array1[] = obj_1.mainMethod(a,b);
        for(int i = 0; i < 2; i++){
            System.out.println("array1[" + i + "] = " + array1[i]);
        }

        System.out.println("Вывод при передаче 3 чисел:");
        int array2[] = obj_2.mainMethod(a,b,c);
        for(int i = 0; i < 2; i++){
            System.out.println("array2[" + i + "] = " + array2[i]);
        }

        System.out.println("Вывод при передаче 4 чисел:");
        int array3[] = obj_3.mainMethod(a,b,c,d);
        for(int i = 0; i < 2; i++){
            System.out.println("array3[" + i + "] = " + array3[i]);
        }

        System.out.println("Вывод при передаче 5 чисел:");
        int array4[] = obj_4.mainMethod(a,b,c,d,e);
        for(int i = 0; i < 2; i++){
            System.out.println("array4[" + i + "] = " + array4[i]);
        }
    }
}
