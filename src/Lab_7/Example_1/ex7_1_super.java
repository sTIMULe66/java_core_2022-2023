package Lab_7.Example_1;

public class ex7_1_super {
    private String text1 = new String();

    ex7_1_super(){
        text1 = null;
    }

    ex7_1_super(String text){
        text1 = text;
    }

    @Override
    public String toString() {
        String text = text1;
        String nss = ("Класс: ex7_1_super\t" + "Text1 = " + text);
        return nss;
    }

}
