package JavaFundamentals.CamaraEx.oop;

import java.util.Objects;

public class Borcan
{
    private String continut;

    public static int totalBorcane = 0;

    public Borcan(String continut)      //constructorul
    {
        this.continut = continut;
        totalBorcane++;                //cand se adauga borcane creste contorul
    }
    public String getContinut()
    {
        return continut;
    }
    public void setContinut(String continut)
    {
        this.continut = continut;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Borcan borcan = (Borcan) o;
        return Objects.equals(continut, borcan.continut);
    }
    @Override
    public int hashCode() {
        return Objects.hash(continut);
    }
}