package JavaFundamentals;

import JavaFundamentals.varargs.VarArgsUtils;

import java.util.Scanner;

public class ArrayExercise {

    /*
    read from keyboard the array dimensions m and n
    create an int array of dimension[m,n]
    read from keyboard all values in the array
    calculate
    1 min value
    2 max value
    3 sum of all values using VarArgsUtils.getSum method
    4 calculate average value
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("m=");
        int m = Integer.parseInt(in.nextLine());
        System.out.print("n=");
        int n = Integer.parseInt(in.nextLine());

        System.out.println("Creating array of dimensions (" + m + "," + n + ")");

        int[][] array = new int[m][n];
        System.out.println("Please input values");

        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0;
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print("array["+i+","+j+"]= ");
                array[i][j] = Integer.parseInt(in.nextLine());
                if(array[i][j]<min){
                    min=array[i][j];
                }
                if(array[i][j]>max){
                    max=array[i][j];
                }

            }
            sum+= VarArgsUtils.getSum(array[i]);
        }
        System.out.println("min = "+min);
        System.out.println("max = "+max);
        System.out.println("suma este "+sum);
        System.out.println("AVG este "+sum/(m*n));
    }
}