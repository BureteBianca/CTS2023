package observer.main;

import observer.Client;
import observer.IClient;
import observer.IRestaurant;
import observer.Restaurant;

import javax.management.relation.InvalidRelationTypeException;

public class Main {
    public static void main(String[] args) {
        IClient client=new Client("Ana");
        IClient client1=new Client("Maria");
        IClient client2=new Client("Andrei");


        Restaurant restaurant= new Restaurant("Tratoria");

        restaurant.introduceOfertaNoua();


        restaurant.abonareClient(client1);
        restaurant.adaugaDiscount(25);


        restaurant.dezaabonareClient(client2);
        restaurant.introduceOfertaNoua();


    }
}
