package JavaFundamentals;

public class Array3
{
    public static void main(String[] args){
        int[][] a = {
                {1,2,3},
                {4,5,6,9},
                {7},
        };
        for(int i=0;i<a.length;i++)
        {
            for(Object j: a[i]){
                System.out.println(j);
            }
        }
    }
}
