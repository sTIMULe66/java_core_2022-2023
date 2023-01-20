package Lab_6.Example_7;

public class ex6_7 {
    static int[] mainMethod(char [] char_array){
        int [] int_array = new int [char_array.length];
        for(int i = 0; i < int_array.length; i++) {
            int_array[i] = char_array[i];
        }

        return int_array;
    }
}
