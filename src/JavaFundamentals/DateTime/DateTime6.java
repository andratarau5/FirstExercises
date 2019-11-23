package JavaFundamentals.DateTime;

import java.time.LocalDate;

public class DateTime6 {
    //Writee a Java program to get the months remaining in the year.
    public static void main(String[] args){
        LocalDate lunaAsta = LocalDate.now();
        int raspuns = 12 - lunaAsta.getMonthValue();
        System.out.println(raspuns);
    }
}
