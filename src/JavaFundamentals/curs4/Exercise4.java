package JavaFundamentals.curs4;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner firstScanner = new Scanner(System.in);
        System.out.print("Adauga text: ");
        String prop = firstScanner.nextLine();
        prop=prop.toUpperCase();
        System.out.println(prop);

        char[] litere = new char[prop.length()];
        int[] count = new int[prop.length()];

        for (int i = 0; i < prop.length(); i++) {
            if (prop.charAt(i) == ' ') {
                continue;
            }
            boolean isDuplicate = isDuplicate(litere, count, prop.charAt(i));
            if (isDuplicate == false) {
                int j=findEmptyPosition(litere);
                litere[j] = prop.charAt(i);
                count[j] = 1;
            }
        }
        afisare(litere);
        System.out.println();
        afisare(count);
    }

    public static int findEmptyPosition(char[] array){
        for (int j = 0; j < array.length; j++) {
            if (array[j] == 0) {
                return j;
            }
        }
        return -1;
    }

    private static boolean isDuplicate(char[] litere, int[] count, char lit) {
        boolean isDuplicate = false;
        for (int j = 0; j < litere.length; j++) {
            if (litere[j] == lit) {
                count[j]++;
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }

    private static void afisare(char[] array) {
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
    }

    private static void afisare(int[] array) {
        for (int j = 0; j < array.length; j++) {
            if(array[j]==0){
                break;
            }
            System.out.print(array[j] + " ");
        }
    }
}
