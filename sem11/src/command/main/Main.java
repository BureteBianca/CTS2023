package command.main;

import command.Autobuz;
import command.CommandPlecareCursa;
import command.ManagerComenzi;

public class Main {
    public static void main(String[] args) {
        Autobuz autobuz=new Autobuz(1);
        ManagerComenzi managerComenzi=new ManagerComenzi();


        autobuz.plecareInCursa(2);
        managerComenzi.invocaComanda(new CommandPlecareCursa(10,new Autobuz(1)));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

    }
}

