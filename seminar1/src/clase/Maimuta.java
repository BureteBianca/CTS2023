package clase;

public class Maimuta extends Animal{
    public Maimuta(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat(String zooKeeperName) {
        System.out.println("Maimuta: "+super.getName()+" Varsta: "+super.getAge()+" Hranit de: "+zooKeeperName);

    }
}
