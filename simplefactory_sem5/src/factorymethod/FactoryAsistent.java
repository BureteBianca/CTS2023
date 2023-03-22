package factorymethod;

public class FactoryAsistent implements Factory{

    @Override
    public PersonalSpital createPersonal(String nume) {
        return new Asistent(nume);
    }
}
