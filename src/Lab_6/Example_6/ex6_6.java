package Lab_6.Example_6;

public class ex6_6 {

    static int[] mainMethod(int [] array, int n){
        int size;

        if(n > array.length){
            size = array.length;
        }
        else{
            size = n;
        }

        int [] new_array = new int[size];

        for(int i = 0; i < new_array.length; i++){
            new_array[i] = array[i];
        }

        return new_array;
    }
}
