package trabajo.vacheck.hospital;

import javax.persistence.Entity;

@Entity
public class Sanitario extends trabajo.vacheck.hospital.Usuario {
    final private String IDsanitario;

    public Sanitario(String IDsan){
        IDsanitario = IDsan;
    }

    public String getIDsanitario() {
        return IDsanitario;
    }
}
