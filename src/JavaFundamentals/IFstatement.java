package JavaFundamentals;

import java.util.Scanner;

public class IFstatement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);     //citire de pe tastatura
        String ss = in.nextLine();
        System.out.println("You entered string " + ss);

        /* ex: read from keyboard
        check using if else
        <10
        [10-20]
        [20-30]
        >30
         */

        int x=Integer.parseInt(ss);    //egaleaza cu stringul citit de la tastatura
        if (x<10) {
            System.out.println("x este mai mic de 10 ");
        }
        else
            if(x<=20){
                System.out.println("x este intre [10,20] ");
            }
            else
                if(x>20 && x<=30){
                    System.out.println("x este intre [20,30] ");
                }
                else
                    if(x>30){
                        System.out.println("x este mai mare decat 30 ");
                    }
    }
}