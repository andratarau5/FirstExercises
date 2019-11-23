package JavaFundamentals;

public class Ex2 {

    public static void main(String[] args){
        byte oneByte=23;
        int intVar = oneByte;   //converteste din biti mai putini in biti mai multi
        float floatvar = 4.5f;
        int floatConv = (int)floatvar;   //converteste din biti mai multi in biti mai putini (se pierd numere)
        float oneFloat = oneByte;


        // using printf write hexa of the value above in format XX XX XX XX
        System.out.printf("%08x%n",intVar);
/*
        int int1=1;   //int1 este o valoare
        Integer int2 = new Integer(value 1);  //int2 este un obiect
        if( int1 == (new Integer(value 1))) {   // se face unboxing = scoate valoarea
 */

        System.out.println("Hello \n World");
    }
}
