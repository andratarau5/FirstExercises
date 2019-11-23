package homeExercises;

import java.util.Scanner;

public class Exersare {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Dati n: ");
        int n=Integer.parseInt(in.nextLine());
        int i=2;
        while(i*i<n) {
            while (n % i == 0) {
                n /= i;
            }
            i += 1;
        }
        System.out.println(n);
    }
}
