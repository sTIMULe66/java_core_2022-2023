package Lab_6.Example_1;

public class ex6_1 {

    private char symbol;
    private String text = new String();

    public void OverMethod(char a){
        symbol = a;
    }

    public void OverMethod(String b){
        text = b;
    }

    public void OverMethod(char [] array){
        if(array.length > 1){
            text = new String(array);
        }
        else{
            symbol = array[0];
        }
    }

    public void OutMethod(){
        System.out.println("Символьное поле: " + symbol);
        System.out.println("Текстовое поле: " + text);
    }

}
