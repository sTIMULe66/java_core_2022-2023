package Lab_5.Example_1;

import java.util.Scanner;

class ex1 {
    private char varExample;

    public void m1(){
        Scanner in = new Scanner(System.in);
        varExample = in.nextLine().charAt(0);
        in.close();
    }

    public int m2(){
        int varExampleNum = varExample;
        return varExampleNum;
    }

    public void m3(){
        System.out.println("Значение поля: " + varExample);
        System.out.println("Код символа: " + m2());
    }
}
