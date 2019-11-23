package JavaFundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {
//        Problem 1: Matching a decimal numbers - extract numbers from text
//
//        Blind would equal while oh mr 3.14529 do style. Lain led and fact none.
//        One preferred sportsmen resolving -255.34 the happiness continued. High at of in loud rich true.
//        Oh conveying do immediate 128 acuteness in he. Equally welcome her set nothing has gravity.
//        Fertile suppose shyness 123,340.00 mr up pointed in staying on respect.
        String propozitii ="";

        propozitii += "Blind would equal while oh mr 3.14529 do style. Lain led and fact none.";
        propozitii += "One preferred sportsmen resolving -255.34 the happiness continued. High at of in loud rich true.";
        propozitii += "Oh conveying do immediate 128 acuteness in he. Equally welcome her set nothing has gravity.";
        propozitii += "Fertile suppose shyness 123,340.00 mr up pointed in staying on respect.";

        String regex = "(\\d+(\\.?\\d)\\d*)";

        Pattern pattern = Pattern.compile(regex);

        Matcher cautator = pattern.matcher(propozitii);

        int count = 0;
        while(cautator.find()) {
            count++;
            System.out.println(cautator.group(1));
        }
        System.out.println(count + " numbers found");


    }
}
