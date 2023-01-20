package Lab_7.Example_1;

public class ex7_1_sub extends ex7_1_super{
    private String text2 = new String();

    ex7_1_sub(){
        super();
        text2 = null;
    }

    ex7_1_sub(String text_1){
        super(text_1);
        text2 = null;
    }

    ex7_1_sub(String text_1, String text_2){
        super(text_1);
        text2 = text_2;
    }

    @Override
    public String toString() {
        String nss = ("Класс: ex7_1_sub\t" + "Text1 = " + super.toString() + "\tText2  = " +  text2);
        return nss;
    }
}
