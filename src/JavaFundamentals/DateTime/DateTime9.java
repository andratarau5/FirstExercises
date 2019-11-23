package JavaFundamentals.DateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime9 {
    //Write a Java program that checks if a date read from console is before or after current date time
    public static void main(String[] args){

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");

        LocalDateTime acum = LocalDateTime.now();

        System.out.println(acum.format(formatter));
        System.out.println(acum);


        System.out.print("Input date time: ");
        Scanner in = new Scanner(System.in);
        String dateInText =in.nextLine();
        System.out.println(dateInText);

        LocalDateTime timpCitit = LocalDateTime.parse(dateInText,formatter);
        System.out.println(timpCitit);

        if(timpCitit.isBefore(acum)){
            System.out.println("Timpul citit este mai vechi decat data si timpul actual");
        }else{
            System.out.println("Timpul citit este mai nou decat data si timpul actual");
        }
    }
}
