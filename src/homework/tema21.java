package homework;

import java.util.Scanner;

public class tema21 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int Ap=0, At=0, Pp=0, Pt=0;
        double Ac=0, Cc=0;
        int lengthP=0, lengthT=0,highT;
        double raza=0;
        double pi=3.14;

        System.out.println("Ce figura? ");
        String f1=in.nextLine();
        if(f1.equals("Patrat")) {
            System.out.print("latura Patrat: ");
            String s1 = in.nextLine();
            lengthP = Integer.parseInt(s1);
            Ap = lengthP * lengthP;
            Pp = 4 * lengthP;
            System.out.println("Patrat: Aria=" + Ap + ", Perimetru=" + Pp);


        }else if(f1.equals("Cerc")){
            System.out.print("raza Cerc: ");
            String s2=in.nextLine();
            raza=Integer.parseInt(s2);
            Ac=pi*raza*raza;
            Cc=2*pi*raza;
            System.out.println("Cerc: Aria="+Ac+" Circumferinta="+Cc);


        }else if(f1.equals("Triunghi")){
            System.out.print("latura Triunghi: ");
            String s3=in.nextLine();
            lengthT=Integer.parseInt(s3);
            System.out.print("inaltime Triunghi: ");
            String s4=in.nextLine();
            highT=Integer.parseInt(s4);
            At=(lengthT*highT)/2;
            Pt=3*lengthT;
            System.out.println("Triunghi: Aria="+At+" Perimetru="+Pt);


        }else{
            System.out.println("Exit");
        }
    }
}
