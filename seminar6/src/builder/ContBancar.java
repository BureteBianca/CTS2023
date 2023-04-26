package builder;

public class ContBancar implements IBuilder{
    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internetBanking;

    public ContBancar(boolean primesteSalariu, boolean cardAtasat, String numeClient, boolean internetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.cardAtasat = cardAtasat;
        this.numeClient = numeClient;
        this.internetBanking = internetBanking;
    }

    public ContBancar(boolean primesteSalariu, boolean cardAtasat, String anonim) {
    }

    public boolean isPrimesteSalariu() {
        return primesteSalariu;
    }

    public boolean isCardAtasat() {
        return cardAtasat;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public boolean isInternetBanking() {
        return internetBanking;
    }

    @Override
    public String toString() {
        return "ContBancar{" +
                "primesteSalariu=" + primesteSalariu +
                ", cardAtasat=" + cardAtasat +
                ", numeClient='" + numeClient + '\'' +
                ", internetBanking=" + internetBanking +
                '}';
    }
}
