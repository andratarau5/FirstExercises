package JavaFundamentals.varargs;

public class VarArgsUtils {
    public static int getSum(int... args)
    {
        int sum=0;
        for(int arg: args)
        {
            sum+=arg;
        }
        return sum;
    }
}
