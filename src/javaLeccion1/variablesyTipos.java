package javaLeccion1;

public class variablesyTipos {
    public static void main(String[] args){

        String var1 = "This is a string variable";
        System.out.println(var1);

        Integer var2 = 21;
        int var3 = 8;
        System.out.println("This variables ar Numbers: "+ var2 + var3);

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
