package builder.main;

import builder.ContBancar;
import builder.ContBancarBuilder;
import builder.ContBuilder;
import builder.IBuilder;

public class Main {
    public static void main(String[] args) {
        IBuilder contBuilder = new ContBuilder();
        contBuilder.setNumeClient("Andreea").setCardAtasat(true);
        ContBancar contBancar = contBuilder.build();

        ContBancar contBancar1= contBuilder.setNumeClient("Maria").setPrimesteSalariu(true).build();
        System.out.println(contBancar);
        System.out.println(contBancar1);


        IBuilder contBancarBuilder = new ContBancarBuilder();
        ContBancar cont = contBancarBuilder.setInternetBanking(true).setNumeClient("Carmen").build();
        System.out.println(cont);

        //cont.setInternetBanking(false);
    }
}
