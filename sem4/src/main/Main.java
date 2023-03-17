package main;

import singleton.classics.BazaDate;
import singleton.classics.Secretariat;

public class Main {
    public static void main(String[] args) {
        Secretariat secretariat = Secretariat.getInstance(2043,10);
        Secretariat secretariat2 = Secretariat.getInstance(2041,15);

        System.out.println(secretariat);
        System.out.println(secretariat2);

        BazaDate bazaDate=BazaDate.getInstance();
        BazaDate bazaDate1=BazaDate.getInstance();

        bazaDate.setDimensiuneData(200);
        bazaDate1.setDimensiuneData(300);

        System.out.println(bazaDate);
        System.out.println(bazaDate1);


    }
}
