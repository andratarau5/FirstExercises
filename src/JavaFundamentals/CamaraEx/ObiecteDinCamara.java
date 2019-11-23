package JavaFundamentals.CamaraEx;

public class ObiecteDinCamara {
    private String continut;
    public String getContinut(){
        return continut;
    }
    public void setContinut(String continut){
        this.continut=continut;
    }
    public void afisare(){
        System.out.println("Obiect din camara: "+continut);
    }
}
