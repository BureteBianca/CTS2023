package factorymethod;

public class FactoryMedic implements Factory{

    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Medic(nume);
    }
}
