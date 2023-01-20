package Lab_6.Example_7;

public class main {
    public static void main(String[] args) {
        char [] char_array = {'a', 'b', 'c'};
        ex6_7 obj = new ex6_7();
        int int_array[] = obj.mainMethod(char_array);

        for(int i = 0; i < char_array.length; i++) {
            System.out.print(char_array[i] + "\t");
        }
        System.out.print("\n");

        for(int i = 0; i < int_array.length; i++) {
            System.out.print(int_array[i] + "\t");
        }
        System.out.print("\n");
    }
}
