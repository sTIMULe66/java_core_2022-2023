package Lab_6.Example_10;

public class ex6_10 {
    static int[] mainMethod(int ... array) {
        int [] new_array = new int[2];
        new_array [0]= array[0];
        new_array [1] = array[0];

        for (int i = 0; i < array.length; i++) {
            if (new_array [1] < array[i]) {
                new_array [1] = array[i];
            }
            if (new_array [0] > array[i]) {
                new_array [0] = array[i];
            }
        }

        return new_array;
    }
}
