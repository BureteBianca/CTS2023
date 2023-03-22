package simple.factory;

public class Asistent extends PersonalSpital{
    private String nume;
    public Asistent(String nume){
        super(nume);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Asistentul"+super.getNume());
    }
}
