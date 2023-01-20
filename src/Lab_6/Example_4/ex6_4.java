package Lab_6.Example_4;

public class ex6_4 {

    public static void mainMethod(int n){
        int k = n, b = n;
        if(n % 2 == 0){
            do{
                k = (k - 2);
                b = b * k;
            }
            while (k != 2);
        }
        if(n % 2 == 1){
            do{
                k = (k - 2);
                b = b * k;
            }
            while (k != 1);
        }
        System.out.println(n + "!! = " + b);
    }
}
