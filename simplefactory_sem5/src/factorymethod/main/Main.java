package factorymethod.main;

import factorymethod.FactoryBrancardier;
import factorymethod.FactoryMedic;
import factorymethod.PersonalSpital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactoryMedic factoryMedic = new FactoryMedic();
        FactoryBrancardier factoryBrancardier = new FactoryBrancardier();

        List<PersonalSpital> listaPersonal = new ArrayList<>();
        listaPersonal.add(factoryMedic.createPersonal("Ciprian"));
        listaPersonal.add(factoryMedic.createPersonal("Jhon"));
        listaPersonal.add(factoryBrancardier.createPersonal("Gigi"));
    }
}
