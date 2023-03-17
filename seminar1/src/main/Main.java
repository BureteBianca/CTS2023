package main;

import clase.*;

public class Main {

    public static void main(String[] args)
    {
        ZooKeeper ingrijitor=new ZooKeeper("Andrei");
        Zoo zoo=new Zoo("Zoo",ingrijitor);
        zoo.addAnimal(new Lion("Simba",10));
        zoo.addAnimal(new Zebra("Marti",11));
        zoo.addAnimal(new Lion("Mufasa",15));
        zoo.feedAllAnimals();
        zoo.addAnimal(new Maimuta("Harambe",29));
        zoo.addAnimal(new Maimuta("Nadina",17));
        zoo.feedAllAnimals();
    }
}
