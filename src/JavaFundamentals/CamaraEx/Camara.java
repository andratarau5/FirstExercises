package JavaFundamentals.CamaraEx;

/*
    Se creeaza mai multe clase care se apeleaza una din alta
    Camara -> Stelaj -> Raft -> ObiecteDinCamara (Sticla, Borcan)
 */
public class Camara {
    private Stelaj[] stelaje;                //DECLARARE Camara care are stelaje (un nr X de stelaje) stelaje de tip Stelaj

    public Camara(int nrStelaje){
        stelaje=new Stelaj[nrStelaje];       //INSTANTIERE =creeaza un array de o dimensiune (null/gol) si se rezerva un spatiu pt el

        for(int i=0;i<nrStelaje;i++){        //se parcurge array-ul si fiecare e ceva
            stelaje[i]=new Stelaj();         //INITIALIZARE =se creeaza un obiect in array
        }
    }

    //new Camara(10); se apeleaza functia de sus;  "Camara" este tipul
    public void afisare(){                         //metoda;  void= nu returneaza nimic
        System.out.println("Afisare camara ");
        for(int i=0;i<stelaje.length;i++){
            //System.out.println("Stelaje "+i);
            stelaje[i].afisare();
        }
    }


    public boolean isEmpty(){                       //metoda=> returneaza true sau false
        boolean empty=true;
        for(Stelaj st: stelaje)
            empty=empty || st.isEmpty();
        return empty;
    }


    public boolean adauga(Borcan borcan){
        for(Stelaj st: stelaje){
            //if(st.isFull())
            if(st.adaugare(borcan))
                return true;
        }
        return false;
    }


    public boolean adauga(Sticla sticla){
        for(Stelaj st: stelaje){
            //if(st.isFull())
            if(st.adaugare(sticla))
                return true;
        }
        return false;
    }

    public boolean retrage(Borcan borcan){
        for(Stelaj st: stelaje){
            if(st.retragere(borcan))
                return true;
        }
        return false;
    }
    public boolean retrage(Sticla sticla){
        for(Stelaj st: stelaje){
            //if(st.isFull())
            if(st.retragere(sticla))
                return true;
        }
        return false;
    }
}
