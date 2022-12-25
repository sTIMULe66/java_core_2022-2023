package Lab_5.Example_5;

class ex5 {
    private int v1;

    ex5(){
        System.out.println("Выбран конструкт без передачи аргументов");
        v1 = 0;
    }
    ex5(int tmp){
        System.out.println("Выбран конструкт с передачей целочисленного аргумента");
        if(tmp <= 100){
            v1 = tmp;
        }
        else{
            v1 = 100;
        }
    }

    public void m1(){
        System.out.println("Полю присвоено значение 0");
        v1 = 0;
    }

    public void m1(int tmp){
        if(tmp <= 100){
            System.out.println("Полю присвоено значение переданного аргумента");
            v1 = tmp;
        }
        else{
            System.out.println("Превышено допустимое значение! Полю присвоено значение 100");
            v1 = 100;
        }
    }

    public void m2(){
        System.out.println("Значение поля = " + v1);
    }
}
