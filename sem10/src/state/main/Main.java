package state.main;

import state.Masa;

public class Main {
    public static void main(String[] args) {
        Masa masa=new Masa(1);
        masa.ocupareMasa();
        masa.rezervaMasa();

        masa.elibereazaMasa();
    }
}

