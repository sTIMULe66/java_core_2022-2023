package Lab_5.Example_5;

class ex5 {
    private int v1;

    ex5(int tmp){
        v1 = tmp;
    }

    public void m1(){
        v1 = 0;
    }

    public void m1(int tmp){
        if(tmp <= 100){
            v1 = tmp;
        }
        else{
            System.out.println("Превышено допустимое значение! Полю присвоено значение 100");
            v1 = 100;
        }

    }
}
