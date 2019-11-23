package JavaFundamentals;

public class WhilesiDoWhile {
    public static void main(String[] args) {
        System.out.println("********WHILE*********");
        int x = 0;
        while (x < 10) {              // se evalueaza expresia si APOI se face codul
            System.out.println(x);
            if(x==5){
                continue;
            }
            if(x==3){
                break;               // fara break face la infinit
            }
            x++;
        }

        System.out.println("******DO WHILE******");
        int y = 0;
        do {                         //se face codul si APOI se evalueaza expresia
            System.out.println(y);
            if(y==5){
                continue;
            }
            if(y==3){
                break;               // fara break face la infinit
            }
            y++;
        }while(y<10);
    }
}


