package Lab_6.Example_9;

public class main {
    public static void main(String[] args) {
        char[] char_array = {'a', 'b', 'c', 'd', 'e'};
        ex6_9 obj = new ex6_9();
        char new_array[] = obj.mainMethod(char_array);

        for (int i = 0; i < char_array.length; i++) {
            System.out.print(char_array[i] + "\t");
        }
        System.out.print("\n");
        for(int i = 0; i < new_array.length; i++) {
            System.out.print(new_array[i] + "\t");
        }
        System.out.print("\n");
    }
}