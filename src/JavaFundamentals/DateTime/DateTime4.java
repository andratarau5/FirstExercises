package JavaFundamentals.DateTime;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.YEARS;

public class DateTime4 {
    //Write a Java program to get the dates 10 days before and after today
    public static void main(String[] args){
        LocalDate astazi=LocalDate.now();
        LocalDate acumZeceZile;
        LocalDate dupaZeceZile;

        acumZeceZile=astazi.minus(10, DAYS);
        dupaZeceZile=astazi.plus(10,DAYS);

        //acumZeceZile=astazi.minusDays(10);
        //dupaZeceZile=astazi.plusDays(10);

        acumZeceZile=acumZeceZile.minusDays(10);     //face de doua ori scaderea, odata mai sus si odata aici
        dupaZeceZile=dupaZeceZile.plusDays(10);      //       -//-

        LocalDate acumUnAn=astazi.minus(1,YEARS);

        System.out.println(astazi);
        System.out.println(acumZeceZile);
        System.out.println(dupaZeceZile);
        System.out.println(acumUnAn);

    }
}
