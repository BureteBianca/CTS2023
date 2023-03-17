package singleton.classics;

public class BazaDate {
    private int dimensiuneData;
    private int numarTabele;
    private String denumire;

    public static BazaDate instanta=new BazaDate(100,2,"OOP");
    public BazaDate()
    {

    }

    private BazaDate(int dimensiuneData, int numarTabele, String denumire) {
        this.dimensiuneData = dimensiuneData;
        this.numarTabele = numarTabele;
        this.denumire = denumire;
    }

    public void setDimensiuneData(int dimensiuneData) {
        this.dimensiuneData = dimensiuneData;
    }

    public void setNumarTabele(int numarTabele) {
        this.numarTabele = numarTabele;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public static BazaDate getInstance(){
        return instanta;
    }

    @Override
    public String toString() {
        return "BazaDate{" +
                "dimensiuneData=" + dimensiuneData +
                ", numarTabele=" + numarTabele +
                ", denumire='" + denumire + '\'' +
                '}';
    }
}
