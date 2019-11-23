package JavaFundamentals.DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DateTime8 {
    //Write a Java program to compute the difference between two dates (month, year, day)

    public static void main(String[] args) {
        LocalDate firstDate = citesteDeLaTastatura();
        LocalDate secondDate = citesteDeLaTastatura();

        System.out.println(firstDate);
        System.out.println(secondDate);

        Period perioada = Period.between(firstDate,secondDate);
        System.out.println(perioada);
    }


    public static LocalDate citesteDeLaTastatura() {

        Scanner in = new Scanner(System.in);

        System.out.print("Year: ");
        String year = in.nextLine();

        System.out.print("Month: ");
        String month = in.nextLine();

        System.out.print("Day: ");
        String day = in.nextLine();

        int yearInIntFormat = Integer.parseInt(year);
        int monthInIntFormat = Integer.parseInt(month);
        int dayInIntFormat = Integer.parseInt(day);

        return LocalDate.of(yearInIntFormat, monthInIntFormat, dayInIntFormat);

    }
}
