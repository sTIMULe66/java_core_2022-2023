package Lab_6.Example_2;

public class ex6_2 {

    private static int count = 0;

    public static void OutMethod(){
        System.out.println("Текущее значение закрытого поля: " + count);
        count ++;
        System.out.println("Значение поля было измененно");
    }
}
