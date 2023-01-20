package Lab_6.Example_9;

public class ex6_9 {
    static char[] mainMethod(char [] array){
        char [] new_array = new char[array.length];
        int i = 0, k = new_array.length - 1;
        while (i< new_array.length){
            new_array[k]=array[i];
            i++;
            k--;
        }
        return new_array;
    }
}
