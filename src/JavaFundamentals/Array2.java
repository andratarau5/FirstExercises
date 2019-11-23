package JavaFundamentals;

public class Array2 {
    public static void main(String[] args){
        Object[] arraysOfObjects = new Object[3];
        arraysOfObjects[0]=1;
        arraysOfObjects[1]=2.0d;
        arraysOfObjects[2]="ana are mere";
        for(Object o: arraysOfObjects){
            System.out.println(o);
        }

        /*
        if int print hexa
        if double print 3 decimals
        else print as string
        */
        for(Object o: arraysOfObjects)
        {
            if(o instanceof Integer) {
                System.out.printf("%#08x%n", o);
            } else if(o instanceof Double) {
                System.out.printf("%.3f%n", o);
            } else
            {System.out.println(o);}
        }

    }
}
