package factorymethod;

public abstract class PersonalSpital {
    public String nume;
    public PersonalSpital(String nume)
    {
        this.nume=nume;
    }
    public abstract void afiseazaDescriere();

    public String getNume() {
        return nume;
    }
}
