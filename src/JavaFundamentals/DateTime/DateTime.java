package JavaFundamentals.DateTime;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;

public class DateTime {
    //Write a Java program to get a day-in-week name.

    public static void main(String[] args) {
        LocalDate acum = LocalDate.now();
        System.out.println(acum);
        System.out.println();

        LocalDateTime acumCuTimp=LocalDateTime.now();    //Timpul si Data
        System.out.println(acumCuTimp);


        System.out.println();
        Instant chiarAcum=Instant.now();                 //Timpul si Data instant, in momentul acesta
        System.out.println(chiarAcum);
        System.out.println(Instant.EPOCH);
        System.out.println();


        System.out.println();
        ZonedDateTime acumCuFus= ZonedDateTime.now();    //Timpul si Data cu zona gmt
        System.out.println(acumCuFus);
    }
}
