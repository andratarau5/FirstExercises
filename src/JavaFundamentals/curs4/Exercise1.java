package JavaFundamentals.curs4;

public class Exercise1 {
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
