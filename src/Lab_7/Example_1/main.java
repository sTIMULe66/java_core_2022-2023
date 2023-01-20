package Lab_7.Example_1;

public class main {
    public static void main(String[] args) {
        String one = "11111";
        String two = "22222";

        ex7_1_super obj_super_1 = new ex7_1_super();
        System.out.println(obj_super_1.toString());

        ex7_1_super obj_super_2 = new ex7_1_super(one);
        System.out.println(obj_super_2.toString());

        ex7_1_sub obj_sub_1 = new ex7_1_sub();
        System.out.println(obj_sub_1.toString());

        ex7_1_sub obj_sub_2 = new ex7_1_sub(one);
        System.out.println(obj_sub_2.toString());

        ex7_1_sub obj_sub_3 = new ex7_1_sub(one, two);
        System.out.println(obj_sub_3.toString());
    }
}
