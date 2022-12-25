package Lab_5.Example_4;

class ex4 {
    char v1;
    int v2;

    ex4(){
        System.out.println("Выбран конструкт без передачи аргументов");

    }
    ex4(char tmp1){
        System.out.println("Выбран конструкт с передачей символьного аргумента");
        v1 = tmp1;
    }
    ex4(int tmp2){
        System.out.println("Выбран конструкт с передачей целочисленного аргумента");
        v2 = tmp2;
    }
    ex4(char tmp1, int tmp2){
        System.out.println("Выбран конструкт с передачей двух аргументов");
        v1 = tmp1;
        v2 = tmp2;
    }
    ex4(double tmp){
        System.out.println("Выбран конструкт с передачей double аргумента");
        v1 = (char) (tmp / 1);
        v2 = (int) (tmp % 1 * 100);
    }
}
