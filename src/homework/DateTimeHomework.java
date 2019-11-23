package homework;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.*;
import java.time.format.DateTimeFormatter;

public class DateTimeHomework {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Dati n: ");
        int n = Integer.parseInt(in.nextLine());   //parseInt - metoda statica din Integer

        while ((n >= 15) || (n <= 0)) {
            System.out.println("Incorrect Value!!!!Please insert a value from 1 to 14");
            System.out.println("n =");
            n = Integer.parseInt(in.nextLine());
        }

        LocalDateTime[] data = new LocalDateTime[n];  //declaram un Array cu dimensiunea n
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy HH:mm:ss");

        for (int i = 0; i < data.length; i++) {
            System.out.print("data[" + i + "]=");
            data[i] = LocalDateTime.parse(in.nextLine(), formatter);  //citeste data in formatul corespunzator
            System.out.println("***");
        }


        String option;
        do {
            System.out.println();
            System.out.println("1. List all dates stored so far \n2. Provide a date position;\n Display if date in provided position is during office hours or not\n3. List all dates in office hours\n4. (Bonus) List all dates in chronological order\n0. Exit\n\nYour Option: ");

            option = in.nextLine();
            switch (option) {
                case "1":
                    afisare(data);
                    break;
                case "2": {
                    System.out.println("Dati pozitia de pe care sa se citeasca data: ");
                    int poz = Integer.parseInt(in.nextLine());
                    if (poz <= data.length - 1) {
                        System.out.println("Data de pe pozitia " + poz + " este: " + data[poz]);
                        System.out.println("Ziua saptamanii: " + data[poz].getDayOfWeek());
                        if (officeHours(data[poz]) == true) {
                            System.out.println("Working");
                        } else System.out.println("Free!!!");

                    } else {
                        System.out.println("Pozitia " + poz + " nu exista!!!");
                        do {
                            System.out.println("Dati alta pozitie: ");
                            poz = Integer.parseInt(in.nextLine());
                        }
                        while (poz > data.length - 1);
                        System.out.println("Data de pe pozitia " + poz + " este: " + data[poz]);
                    }
                }
                break;
                case "3": {
                    System.out.println("Dates in office hours: ");

                    for (LocalDateTime c : data) {
                        if (officeHours(c) == true)
                            System.out.println(c);
                    }
                }
                break;
                case "4": {
                    System.out.println(Arrays.toString(data));
                    System.out.println("Datele Sortate Cronologic:");
                    Arrays.sort(data);
                    System.out.println(Arrays.toString(data));

                }
                break;
                case "0":
                    break;
                default:
                    System.out.println("Optiune incorecta!Alegeti [1-4]");
                    continue;
            }
        } while (!"0".equalsIgnoreCase(option));
    }

    public static void afisare(LocalDateTime[] data) {
        System.out.println("Dates stored so far: ");
        for (LocalDateTime d : data) {
            System.out.println(d);
        }
    }

    public static boolean officeHours(LocalDateTime office) {
        if ((office.getDayOfWeek().getValue() < 6) && (office.getHour() >= 9) && (office.getHour() <= 17))
            return true;
        else
            return false;
    }
}

