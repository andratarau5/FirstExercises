package JavaFundamentals;

public class Exercise3 {
    public static void main(String[] args){
        int[] array;
        int k=0;
        array = counter(100);
        afisare(array);
    }

    private static void afisare(int[] array) {
        for(int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }
    }

    private static int[] counter(int limit) {
        int[] array=new int[limit];
        int k=0;
        for(int i=0;k<limit;i++){
            if(i%11==0){
                array[k++]=i;
            }
        }
        return array;
    }
}
