package JavaFundamentals.curs4;

public class Exercise1 {
    /*
    Write pieces of code that count from 0 to 1000, with increments of 5. It prints to the console only the numbers composed of the same digit.
    Use all 3 loop operators. The code shall be placed in a new method, called from main.
    Also print the last number (1000). You should print the same thing three times
    */

    public static void main(String[] args){
        countNumbers();
    }
    private static void countNumbers() {
        for(int i=0;i<=1000;i=i+5) {
            if(i==5 || i==55 || i==555||i==1000){
                System.out.println(i);
            }
        }
    }
}
