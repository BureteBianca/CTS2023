package simple.factory.main;

import simple.factory.PersonalSpital;
import simple.factory.SimpleFactory;
import simple.factory.TipPersonal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SimpleFactory simpleFactory =new SimpleFactory();
        List<PersonalSpital> list = new ArrayList<>();
        PersonalSpital personalSpital=simpleFactory.createPersonal(TipPersonal.Medic, "Andrei");
        PersonalSpital personalSpital1=simpleFactory.createPersonal(TipPersonal.Asistent, "Gigi");
        PersonalSpital personalSpital2=simpleFactory.createPersonal(TipPersonal.Brancardier, "Vali");
        PersonalSpital personalSpital3=simpleFactory.createPersonal(TipPersonal.Medic, "Catalin");
        PersonalSpital personalSpital4=simpleFactory.createPersonal(TipPersonal.Anestezist, "Grigore",5);
        list.addAll((List.of(personalSpital,personalSpital1,personalSpital2,personalSpital3,personalSpital4)));
        for (PersonalSpital personalSpital5 : list){
            personalSpital5.afiseazaDescriere();
        }
    }
}
