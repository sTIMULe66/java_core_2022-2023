package Lab_5.Example_3;

public class main {
    public static void main(String[] args) {
    ex3 t1 = new ex3();
    System.out.println("v1 = " + t1.v1);
    System.out.println("v2 = " + t1.v2);

    int a = 5;
    ex3 t2 = new ex3(a);
    System.out.println("v1 = " + t2.v1);
    System.out.println("v2 = " + t2.v2);

    int b = 5;
    ex3 t3 = new ex3(a,b);
    System.out.println("v1 = " + t3.v1);
    System.out.println("v2 = " + t3.v2);
    }
}
