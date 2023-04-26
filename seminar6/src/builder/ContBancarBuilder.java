package builder;

public class ContBancarBuilder {

    private boolean primesteSalariu;
    private boolean cardAtasat;
    private String numeClient;
    private boolean internetBanking;

    public ContBancarBuilder(boolean primesteSalariu, boolean cardAtasat, String numeClient,boolean internetBanking) {
        this.primesteSalariu = primesteSalariu;
        this.cardAtasat = cardAtasat;
        this.numeClient = numeClient;
        this.internetBanking=internetBanking;
    }

    public ContBancarBuilder()
    {
        this.primesteSalariu=false;
        this.cardAtasat=false;
        this.numeClient="Alexandru";
        this.internetBanking=false;
    }

    public ContBancarBuilder setPrimesteSalariu(boolean primesteSalariu) {
        this.primesteSalariu = primesteSalariu;
        return this;
    }

    public ContBancarBuilder setCardAtasat(boolean cardAtasat) {
        this.cardAtasat = cardAtasat;
        return this;
    }

    public ContBancarBuilder setNumeClient(String numeClient) {
        this.numeClient = numeClient;
        return this;
    }

    public ContBancarBuilder setInternetBanking(boolean internetBanking) {
        this.internetBanking = internetBanking;
        return this;
    }

    public ContBancarBuilder build(){
        ContBancar cont = new ContBancar(this.primesteSalariu,this.internetBanking, this.numeClient,this.primesteSalariu);
    }
}
