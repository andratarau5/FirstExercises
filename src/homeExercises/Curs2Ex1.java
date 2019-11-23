package homeExercises;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Curs2Ex1 {
    public static void main(String[] args) {
        System.out.println("********EX 1********");
       /*
       Create variable of type String. Initialize it with value Lorem ipsum dolor sit amet , consectetur adipiscing elit”
    a)Convert it to lower case
    b)Convert it to upper case
    c)Replace „o” with „z"
    d)Check if your variable ends with „elit”.
        */
        String a = "Lorem ipsum dolor sit amet , consectetur adipiscing elite";
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.replace('o', 'z'));

        boolean end;
        end = a.endsWith("elite");
        System.out.println("Returned value: " + end);


        System.out.println("********EX 2*******");
        //  Write in a comment on each line what result you expect .Launch it and verify the results
        String aa = "abc";
        String b = "abc";
        String c = new String("abc");
        System.out.println(aa == b);
        System.out.println(aa.equals(b));
        System.out.println(b == c);
        System.out.println(b.equals(c));



        /*System.out.println("********EX 3*********");
        System.out.println("What's your age?");
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        int s = Integer.parseInt(ss);
        if(s<18){
            System.out.println("You are a teenager.");
        }else if(s==18){
            System.out.println("You're adult now.");
        }else
            System.out.println("You're getting old.");*/




        /*System.out.println("******EX 4*********");
        Scanner in = new Scanner(System.in);
        String ss=in.nextLine();
        int s=Integer.parseInt(ss);
        if(s==1){
            System.out.println("*");
        }else if(s==2){
            System.out.println("#");
        }else if(s==3){
            System.out.println("&");
        }else if(s==4){
            System.out.println("^");
        }else if(s==5){
            System.out.println("%");
        }else
            System.out.println("Not defined");*/


        /*System.out.println("********EX 5*********");
        Scanner in = new Scanner(System.in);
        String ss = in.nextLine();
        if (ss.equals("ana")) {
            System.out.println("*");
        } else if (ss.equals("are")) {
            System.out.println("#");
        } else if (ss.equals("mere")) {
            System.out.println("&");
        } else if (ss.equals("si")) {
            System.out.println("^");
        } else if (ss.equals("pere")) {
            System.out.println("%");
        } else
            System.out.println("Not defined");  */


    /*
    Modify the sample application so that the retrieved direction comes
    from the console. Verify the application for each case (‚e’, ‚w',..)
     */
      /*  System.out.println("*******EX 6*********");
        Scanner in=new Scanner(System.in);
        String direction=in.nextLine();

        switch(direction.charAt(0)){
            case 'n':
                System.out.println("North");
                break;
            case 's':
                System.out.println("South");
                break;
            case 'w':
                System.out.println("West");
                break;
            case 'e':
                System.out.println("East");
                break;
        }*/


        System.out.println("******EX 7*********");
        Scanner in=new Scanner(System.in);
        String dd=in.nextLine();
        double d=Double.parseDouble(dd);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(df.format(d));

    }
}
