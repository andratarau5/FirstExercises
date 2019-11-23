package JavaFundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args) {
//        Problem 2: Matching phone numbers - extract phone numbers from text
//
//        Over fact all son tell this any his. No 0777 777 777 insisted confined of weddings to returned to debating rendered.
//        Keeps order fully so do party means young. Table nay him jokes quick. In (0777) 777 777 felicity up to graceful mistaken horrible consider.
//        Abode never think to at. So additions necessary +40777777777 concluded it happiness do on certainly propriety. On in green taken do offer witty of.
//        Abode never think to at. So additions necessary +407777777771234567 concluded it happiness do on certainly propriety. On in green taken do offer witty of.
        String propozitii[] = new String[4];

        propozitii[0] = "Over fact all son tell this any his. No 0777 777 777 insisted confined of weddings to returned to debating rendered.";
        propozitii[1] = "Keeps order fully so do party means young. Table nay him jokes quick. In (0777) 777 777 felicity up to graceful mistaken horrible consider.";
        propozitii[2] = "Abode never think to at. So additions necessary +40777777777 concluded it happiness do on certainly propriety. On in green taken do offer witty of.";
        propozitii[3] = "Abode never think to at. So additions necessary +407777777771234567 concluded it happiness do on certainly propriety. On in green taken do offer witty of.";

        String regex = "((\\(?(0|\\+\\d{2})\\d{3}\\)?\\s?\\d{3}\\ ?(\\d{3})\\s))";

        Pattern pattern = Pattern.compile(regex);

        // Cautam in toate propozitiile
        for(String propozitie: propozitii) {
            // Matcher nou pentru fiecare propozitie
            Matcher matcher = pattern.matcher(propozitie);
            if (matcher.find()) {
                // Numerele gasite includ si un caracter spatiu la final (ca sa gasim doar numere de telefon intregi)
                String numarTelefon = matcher.group(1);
                // Eliminam caracterul spatiu (" ") din string-ul gasit
                numarTelefon = numarTelefon.substring(0, (numarTelefon.length()-1));
                System.out.println(numarTelefon);
            }
        }
    }
}
