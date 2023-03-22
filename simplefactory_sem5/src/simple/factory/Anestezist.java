package simple.factory;

public class Anestezist extends PersonalSpital{
        private Integer aniVechime;
        private String nume;
        public Anestezist(String nume, Integer aniVechime){
            super(nume);
            this.aniVechime=aniVechime;
        }

        @Override
        public void afiseazaDescriere() {
            System.out.println("Anestezistul"+super.getNume()+"are"+this.aniVechime+"vechime");
        }
    }

