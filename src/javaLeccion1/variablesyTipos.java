package javaLeccion1;

public class variablesyTipos {
    public static void main(String[] args){
        //number, 1 byte
        byte zero=0;
        System.out.println("byte :" + zero);


        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
            System.out.println(b);
        }
    }
}
