package JavaFundamentals.DateTime;

import java.time.LocalDateTime;

public class DateTime5 {
    //Write a Java program to get a date and time after 2 weeks and 10min;
    public static void main(String[] args){
        LocalDateTime astaziAcum = LocalDateTime.now();
        LocalDateTime raspuns = astaziAcum.plusWeeks(2).plusMinutes(10);
        System.out.println(raspuns);
    }
}
