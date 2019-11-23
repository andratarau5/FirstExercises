package JavaFundamentals.CamaraEx;

public class Raft {
    private ObiecteDinCamara[] obiecte= new ObiecteDinCamara[10];   //raftul are 10 obiecte
    public void afisare(){
        System.out.print("(");
        for(int i=0;i<obiecte.length;i++){
            if(obiecte[i]!=null) {
                obiecte[i].afisare();
            }else{
                System.out.print("_");
            }
            if(i<obiecte.length-1)
                System.out.print(",");
        }
        System.out.println(")");
    }
    public boolean isEmpty(){
        boolean empty=true;
        for(ObiecteDinCamara obj: obiecte)
            empty=empty && (obj!=null);
        return empty;
    }
    public boolean adaugare(ObiecteDinCamara obiect){
        for(int i=0;i<obiecte.length;i++)
            if(obiecte[i]==null){
                obiecte[i]=obiect;
                return true;
            }
        return false;
    }

    public boolean retragere(ObiecteDinCamara obiect){
        for(int i=0;i>obiecte.length;i--)
            if(obiecte[i]!=null){
                obiecte[i]=obiect;
                return true;
            }
        return false;
    }
}
