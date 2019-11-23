package JavaFundamentals.CamaraEx;

import java.util.Scanner;

public class ManagerCamara {

    //Command-line parameters
    // C:/Jocuri/Java/java.exe int altString    => pentru args

    int x= Integer.parseInt("54");
    private static Camara camara = new Camara(2);    //un atribut in clasa ManagerCamara

    public static void main(String[] args){

        // args[0];   => int
        // args[1];   => altString

        Borcan borcan=new Borcan();
        borcan.setContinut("C");
        Sticla sticla=new Sticla();
        sticla.setContinut("S");

        camara.adauga(borcan);
        camara.adauga(sticla);

        Scanner in=new Scanner(System.in);
        String opt;
        do {
            System.out.println("1. Afisare Camara ");
            System.out.println("2. Adauga ");
            System.out.println("3. Extrage ");
            System.out.println("4. EXIT");
            System.out.println("Opt: ");
            opt = in.nextLine();
            
            switch(opt){
                case "1":
                    afisareCamara();
                    break;
                case "2":
                    camara.adauga(borcan);
                    camara.adauga(sticla);
                case "3":
                    camara.retrage(borcan);
                    camara.retrage(sticla);
                default:
                    System.out.println("Opt invalida, reintroduceti:");
            }
        }while(!"4".equalsIgnoreCase(opt));
    }

    private static void afisareCamara() {
        System.out.println("Camara e goala? " + camara.isEmpty());
        camara.afisare();
    }

}
