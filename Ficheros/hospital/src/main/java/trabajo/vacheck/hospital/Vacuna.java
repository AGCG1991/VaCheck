package trabajo.vacheck.hospital;

import javax.persistence.Entity;

@Entity
public class Vacuna {

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
