package Lab_6.Example_3;

public class ex6_3 {

    private static int max, min;
    private static float crt;

    public static void mainMethod(int ... array){
        min = array[0];
        max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
            if(min > array[i]){
                min = array[i];
            }
            crt = array[i] + crt;
        }
        crt = crt/array.length;
    }

    public static void outMethod(){
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
        System.out.println("CRT = " + crt);
    }

}
