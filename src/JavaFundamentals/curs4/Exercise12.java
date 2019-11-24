package JavaFundamentals.curs4;

import java.util.Scanner;

public class Exercise12 {
    /*
    12. Create an application with a menu and with accepting parameters when starting.
        We are going to create a jar and run it with some arguments.
        Create a menu that will enable you to select the desired functionality
            and will stop when the read data is equal to a certain parameter out of the command line.
            E.g: the app will be customized to display the name of the user -u name -q “exit prog”. Etc.
        **) Save the current time that you opened the app. You should have an option in the menu that prints the time spent in the app.
        Write a Java program to cyclically rotate a given array clockwise by one
        Create a program that reads a number in a method. Then create another method that can print a reverse triangle of the size given by the parameter
            ****
            * *
             *
        Create a program that reads two numbers. Then create another method that can print a rectangle of the size given by the parameter. Create also another method that can print the rectangle and the diagonals.
        Read a seuqnce of numbers separated by space. Print the sum of them and product. Also the difference between the biggest and the smallest.
        Read a sequence of numbers from the keyboard separated by ;. Print the new numbers as a difference between the sum of the others and the actual number
        Read a big number from the keyboard (let’ say 20 digits). Compute the division by a one digit number.
     */


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        do {
            System.out.println("1. Punctul A");
            System.out.println("2. Punctul B");
            System.out.println("3. Punctul C");
            System.out.println("4. Punctul D");
            System.out.println("5. Punctul E");
            System.out.println("6. Punctul F");
            System.out.println("7. Punctul G");
            System.out.println("9. Punctul I");
            System.out.print("Choose an option: ");
            option = Integer.parseInt(scan.next());
            switch (option) {
                case 1:
                    PunctA(scan);
                    break;
                case 2:
                    PunctB(scan);
                    break;
                case 3:
                    PunctC(scan);
                    break;
                case 4:
                    PunctD(scan);
                    break;
                case 5:
                    PunctE(scan);
                    break;
                case 6:
                    PunctF(scan);
                    break;
                case 7:
                    PunctG(scan);
                    break;
                case 9:
                    PunctI(scan);
                    break;
                case 0:
                    System.out.println("EXIT");
                default:
                    System.out.println("Optiune incorecta!");
                    continue;
            }
        } while (option != 0);
    }


    public static void PunctA(Scanner scan) {
        //   1.Write a Java program to sum values of an array. Read the size and read the numbers
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("1.Suma este: " + sumaArray(array));
    }

    public static void PunctB(Scanner scan) {
        //   2.Write a Java program to calculate the average value of array elements
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        int avg = sumaArray(array) / dim;
        System.out.println("2.Average value: " + avg);
    }

    public static void PunctC(Scanner scan) {
        //   3. Write a Java program to remove a specific element from an array. Also change the size of the array
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Dimens initiala este: " + array.length);
        printArray(array);
        System.out.println();
        System.out.print("Dati indexul elementului: ");
        int index = scan.nextInt();
        array = extractPosition(array, index);
        System.out.println("Dimensiunea finala: " + array.length);
        printArray(array);
    }

    public static void PunctD(Scanner scan) {
        //   4.Write a Java program to insert an element (specific position) into an array
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.println("Dimens initiala este: " + array.length);
        printArray(array);
        System.out.println();
        System.out.print("Dati indexul elementului: ");
        int index = scan.nextInt();
        System.out.print("Dati valoarea: ");
        int value = scan.nextInt();
        array = addPosition(array, index, value);
        System.out.print("Dimensiunea finala: " + array.length);
        System.out.println();
        printArray(array);
        System.out.println();
    }

    public static void PunctE(Scanner scan) {
        //   5.Write a Java program to find the second largest element in an array.
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);
        System.out.print("Al doilea maxim din array:");
        System.out.println(largestValue(extractElement(array, largestValue(array))));
        System.out.println();
    }

    public static void PunctF(Scanner scan) {
        //   6.Write a Java program to find the number of even and odd integers in a given array of integers
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int[] array = readArray(scan, dim);

        System.out.print("Nr of even: ");
        System.out.println(evenNumber(array));
        System.out.print("Nr of odd: ");
        System.out.println(oddNumber(array));
        System.out.println();
    }

    public static void PunctG(Scanner scan) {
        //   7.Write a Java program to compute the average value of an array of integers except the largest and smallest values
        System.out.print("Dimensiune array: ");
        int dim = scan.nextInt();
        int sum = 0;
        int[] array = readArray(scan, dim);
        array = extractElement(array, smalestValue(array));
        array = extractElement(array, largestValue(array));
        int avg = sumaArray(array) / dim;
        System.out.println("Average value: " + avg);
    }

    public static void PunctI(Scanner in) {
        //Create a program that reads a number in a method. Then create another method that can print a reverse triangle of the size given by the parameter
        //****
        // **
        //  *
        System.out.println("Citim lungimea: ");
        int L = in.nextInt();
        System.out.println("Citim latimea: ");
        int l = in.nextInt();
        for (int i = 0; i < l - 1; i++) {
            if (i == 0 || i == l - 1) {
            } else {
                for (int j = 0; j < L; j++) {
                    if (j == 0 || j == L) {
                        System.out.println("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }
    }


    public static int[] readArray(Scanner scan, int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("array[" + (i + 1) + "]= ");
            array[i] = scan.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        System.out.print("array[]= ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static int sumaArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int[] extractPosition(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index)
                continue;
            else {
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public static int[] addPosition(int[] array, int index, int value) {
        int[] newArray = new int[array.length + 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                newArray[k] = value;
                k++;
            }
            newArray[k] = array[i];
            k++;
        }
        return newArray;
    }

    public static int largestValue(int[] array) {
        int maxValue = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        return maxValue;
    }

    public static int smalestValue(int[] array) {
        int minValue = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }

    public static int[] extractElement(int[] array, int value) {
        int[] newArray = new int[array.length - 1];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value)
                continue;
            else {
                newArray[k] = array[i];
                k++;
            }
        }
        return newArray;
    }

    public static int evenNumber(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                k++;
            }
        }
        return k;
    }

    public static int oddNumber(int[] array) {
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                k++;
            }
        }
        return k;
    }
}
