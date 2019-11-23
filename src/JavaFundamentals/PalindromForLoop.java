package JavaFundamentals;

public class PalindromForLoop {
    public static void main(String[] args){
        String p="rotator";

        for(int i=0;i<p.length()/2;i++){
            System.out.println(p.charAt(i)+ " - " + p.charAt(p.length()-i-1));


            if(!String.valueOf(p.charAt(i)).equalsIgnoreCase(String.valueOf(p.charAt(p.length()-i-1)))){
                System.out.println("Nu este palindrom=> " + p.charAt(i) + " != " + p.charAt(p.length()-i-1));

                //valoarea stringului convertit in caracter este egala cu valoarea cealalta
                break;
            }
        }
    }
}