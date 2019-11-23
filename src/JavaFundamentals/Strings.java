package JavaFundamentals;

public class Strings {
    public static void main(String[] args){
        String a ="abc";
        String b = new String("abc");

        System.out.println(a==b);             //false  pt ca sunt doua obiecte separate
                                              //pentru String b = "abc" => System.out.println(a==b) este true pt ca este acelasi obiect
        System.out.println(a.equals(b));      //true  pt ca se compara valoarea stringului
                                              // "=" compara obiecte
                                              // "equals" compara valorile


        String str = "Ana are mere";
        System.out.println(str.length());
        System.out.println(str.substring(4,7));
        System.out.println(str.substring(str.indexOf("are"),str.indexOf("are")+3));     //afiseaza "are"
        System.out.println(str.substring(str.indexOf("mere"),str.indexOf("mere")+4));   // afiseaza "mere"

        System.out.println(str.replace("are","avea"));  //replace face alt string
        System.out.println(str);                                          //stringurile nu se modifica

        // System.out.println(str.charAt(20));

        String st1="1234";
        String st2=new String("1234");
        System.out.println(st1.compareTo(st2));  //compara 0 cand sunt egale, 1 cand e mai mare, -1 cand e mai mic

        int firstIndex = str.indexOf('e');
        int lastIndex = str.lastIndexOf('e');
        String subStr=str.substring(firstIndex+1,lastIndex-1);
        System.out.println(firstIndex+1+subStr.indexOf('e'));
        System.out.println(str.charAt(9));




        System.out.println("**********string builder************");


        StringBuilder builder = new StringBuilder();
        builder.append("ana ");
        builder.append("are ");
        builder.append("mere");
        System.out.println(builder);

        builder.replace(builder.indexOf("are"),builder.indexOf("are")+3, "avea");
        System.out.println(builder);

        String s = null;
        System.out.println(s.length());

    }
}
