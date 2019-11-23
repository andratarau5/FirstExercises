package JavaFundamentals.CamaraEx;

public class Stelaj {

    /*private Raft [] rafturi=new Raft[4];      //Metoda1

    public Stelaj(){
        for(int i=0;i<rafturi.length;i++){
            rafturi[i]=new Raft();
        }
    }*/


    private Raft[] rafturi=new Raft[]{          //Metoda2
            new Raft(),
            new Raft(),
            new Raft(),
            new Raft(),
    };
    public void afisare(){
        for(int i=0;i<rafturi.length;i++){
            rafturi[i].afisare();
        }
    }

    public boolean isEmpty(){
        boolean empty=true;
        for(Raft raft: rafturi)
            empty=empty && raft.isEmpty();
        return empty;
    }
    public boolean adaugare(ObiecteDinCamara obiect){
        for(Raft raft:rafturi){
            //if(!raft.isFull())
            if(raft.adaugare(obiect))
                return true;
        }
        return false;
    }
    public boolean retragere(ObiecteDinCamara obiect){
        for(Raft raft:rafturi){
            if(raft.retragere(obiect))
                return true;
        }
        return false;
    }

}
