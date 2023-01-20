package Lab_6.Example_1;

public class main {
    public static void main(String[] args) {

        char symbol_in = 'T';
        String text_in = "TEST";
        char [] array_symbol = {'t'};
        char [] array_text = {'T', 'e', 's', 't'};

        ex6_1 obj_1 = new ex6_1();
        ex6_1 obj_2 = new ex6_1();
        ex6_1 obj_3 = new ex6_1();
        ex6_1 obj_4 = new ex6_1();

        System.out.println("Вывод при передаче symbol_in:");
        obj_1.OverMethod(symbol_in);
        obj_1.OutMethod();

        System.out.println("Вывод при передаче text_in:");
        obj_2.OverMethod(text_in);
        obj_2.OutMethod();

        System.out.println("Вывод при передаче array_symbol[]:");
        obj_3.OverMethod(array_symbol);
        obj_3.OutMethod();

        System.out.println("Вывод при передаче array_text[]:");
        obj_4.OverMethod(array_text);
        obj_4.OutMethod();
    }
}
