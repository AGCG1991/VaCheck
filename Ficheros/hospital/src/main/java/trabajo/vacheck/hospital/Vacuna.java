package trabajo.vacheck.hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vacuna {

    @Id
    @GeneratedValue
    private int id;
    private String marca;
    private int dosisenstock;

    public Vacuna(String m, int n) {
        marca=m;
        dosisenstock=n;
    }

    public String consultarmedicina() {
        return "Marca: "+marca;
    }

}
