package JavaFundamentals.curs4;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args){
        Punct1();
    }
    public static void Punct1(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Dimensiune array: ");
        int dim=scan.nextInt();
        int[] array=new int[dim];
        for(int i=0;i<dim;i++){
            System.out.print("array["+ (i+1) +"]= ");
            array[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<dim;i++){
            sum=sum+array[i];
        }
        System.out.println("Suma elementelor din array: "+sum);
    }
}
