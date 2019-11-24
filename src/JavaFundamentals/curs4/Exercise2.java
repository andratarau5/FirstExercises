package JavaFundamentals.curs4;

import java.util.Scanner;

public class Exercise2 {
    /*
    Write a code that reads from the console two positive numbers.
    Then create a loop that counts from 1 until it is equal to the second read number and prints the number.
    The increment is the first read number. The numbers are read inside main, and they are passed as parameters to another method.
    Obs: Search what System.currentTimeMillis() does. Do you need it somewhere?
    Stop the code after 10 seconds
     */
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);

        System.out.print("Read first number: ");
        int n=Integer.parseInt(in.nextLine());

        System.out.print("Read second number: ");
        int m=Integer.parseInt(in.nextLine());
        while(n<0 || m<0){
            System.out.print("Read first number: ");
            n=Integer.parseInt(in.nextLine());

            System.out.print("Read second number: ");
            m=Integer.parseInt(in.nextLine());
        }

        afisare(n, m);
    }

    private static void afisare(int n, int m) {
        long x = System.currentTimeMillis();
        for(int i=1;i!=m;i=i+n){
            System.out.print(i+" ");
            if(System.currentTimeMillis()-x > 10000){
                break;

            }
        }
    }
}
