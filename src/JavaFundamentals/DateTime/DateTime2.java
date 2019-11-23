package JavaFundamentals.DateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class DateTime2 {
    public static void main(String[] args){
        LocalDate astazi=LocalDate.now();
        DayOfWeek dayOfWeek = astazi.getDayOfWeek();
        System.out.println(dayOfWeek);
    }
}
