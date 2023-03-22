package factorymethod;

import factorymethod.PersonalSpital;

public class Medic extends PersonalSpital {
    private String nume;
    public Medic(String nume){
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Medicul"+super.getNume());
    }
}
