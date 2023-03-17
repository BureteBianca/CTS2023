package singletonRegistry;
import java.util.HashMap;
import java.util.Map;

public class InstitutiePublica {

    private String denumire;
    private int nrAngajati;
    private static Map<String, InstitutiePublica> registruInstitutii=new HashMap<>();

    public InstitutiePublica(String denumire, int nrAngajati) {
        this.denumire = denumire;
        this.nrAngajati = nrAngajati;
    }
   public synchronized static InstitutiePublica getInstitutie(String denumire){
        if(registruInstitutii.containsKey(denumire)){
            return registruInstitutii.get(denumire);
        }
        else{
            InstitutiePublica institutiePublica=new InstitutiePublica(denumire,0);
            registruInstitutii.put(denumire,institutiePublica);
            return institutiePublica;
        }
   }

    public void setNrAngajati(int nrAngajati) {
        this.nrAngajati = nrAngajati;
    }

    @Override
    public String toString() {
        return "InstitutiePublica{" +
                "denumire='" + denumire + '\'' +
                ", nrAngajati=" + nrAngajati +
                '}';
    }
}
