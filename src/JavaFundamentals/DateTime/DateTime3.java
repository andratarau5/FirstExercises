package JavaFundamentals.DateTime;

import java.time.LocalDate;
import java.time.Month;

public class DateTime3 {
    public static void main(String[] args){
        //Write a Java program to get the number of days of the current month
            LocalDate astazi = LocalDate.now();
            Month lunaCorespZileiDeAzi = astazi.getMonth();
            int numarulDeZile = lunaCorespZileiDeAzi.length(false);
            System.out.println(lunaCorespZileiDeAzi);
            System.out.println(numarulDeZile);
        }
    }
