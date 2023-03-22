package factorymethod;

import factorymethod.PersonalSpital;

public class Brancardier extends PersonalSpital {
    private String nume;
    public Brancardier(String nume){
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Brancardierul"+super.getNume());
    }
}
