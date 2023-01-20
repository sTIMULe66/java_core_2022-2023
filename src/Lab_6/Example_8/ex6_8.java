package Lab_6.Example_8;

public class ex6_8 {
    static float mainMethod(int [] array){
        float crt =0;
        for(int i = 0; i < array.length; i++){
            crt = array[i] + crt;
        }
        crt = crt / array.length;
        return crt;
    }
}
