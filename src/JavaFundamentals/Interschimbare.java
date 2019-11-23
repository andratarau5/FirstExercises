package JavaFundamentals;

import java.util.Scanner;

public class Interschimbare {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Primul nr este: ");
        int x=Integer.parseInt(in.nextLine());

        System.out.print("Al doilea nr este: ");
        int y=Integer.parseInt(in.nextLine());

        int s;
        s=x;
        x=y;
        y=s;

        System.out.println("Nr inversate: ");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }
}
