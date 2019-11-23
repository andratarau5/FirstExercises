package JavaFundamentals;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        Random rnd = new Random();               //adauga el numere random
        int[] array = new int[]{
                rnd.nextInt(129),         //pana la ce valoare poate sa adauge => pana la 129
                rnd.nextInt(7),
                rnd.nextInt(6),
                rnd.nextInt(3),
                rnd.nextInt(915)
        };
        System.out.println(Arrays.toString(array));
        boolean sorted = false;               //sortarea stim ca e falsa
        while (sorted) {                      //verificam presupunand ca e adevarata
            sorted = true;                    //ca sa se termine while
            for (int i = 0; i < array.length - 1; i++) {
                int aux;
                if (array[i] > array[i + 1]) {     //interschimbare
                    aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    sorted = false;          //ca sa nu se termine while
                }
            }                                // sau "do{} while(!sorted)")
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
