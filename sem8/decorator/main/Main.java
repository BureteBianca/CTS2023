package decorator.main;

import decorator.clase.DecoratorAbstract;
import decorator.clase.FurnizareRezultat;
import decorator.clase.RezultatOnline;
import decorator.clase.RezultatPeHartie;

public class Main {
    public static void main(String[] args) {
        FurnizareRezultat rezultatPeHratie=new RezultatPeHartie();
        rezultatPeHratie.printareRezultat("Raceala");

        DecoratorAbstract decoratorAbstract=new RezultatOnline(rezultatPeHratie);
        decoratorAbstract.afisareOnline("Raceala");
        decoratorAbstract.printareRezultat("Gripa");
    }
}
