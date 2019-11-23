package JavaFundamentals.DateTime;

import java.time.LocalDate;
import java.util.Scanner;

public class DateTime7 {
    //Write a Java program to show the date after reading years, months and days from console
    public static void main(String[] args){
        System.out.print("Year: ");
        Scanner in=new Scanner(System.in);
        String year = in.nextLine();

        System.out.print("Month: ");
        String month = in.nextLine();

        System.out.print("Day: ");
        String day=in.nextLine();

        //System.out.println(year+" "+month+" "+day);    //afisare cu spatii intre ele

        //LocalDate aDate = LocalDate.of(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));

        int yearInIntFormat= Integer.parseInt(year);
        int monthInIntFormat= Integer.parseInt(month);
        int dayInIntFormat= Integer.parseInt(day);

        LocalDate aDate = LocalDate.of(yearInIntFormat,monthInIntFormat,dayInIntFormat);

        System.out.println(aDate);                     //afisare cu linii intre ele
    }
}
