package JavaFundamentals.curs4;

public class Exercise3 {
    /*
    Create an array and initialize it with the first 100 numbers that can be divided by 11.
    Create one method that initializes the array and one method that prints the contents of the array.
    Call them in main.
     */
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
    /*
    Metoda int counter intoarce un array cu primele limit numere diviz cu 11
    @param limit reprez cate nr sa contina array-ul
    @return un array cu primele 100 de nr diviz cu 11
     */
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
