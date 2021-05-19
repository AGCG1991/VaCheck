package trabajo.vacheck.hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Sanitario {

    @Id
    @GeneratedValue
    private Integer IDsanitario;

    public Sanitario(Integer x){
        IDsanitario = x;
    }

    public Integer getIDsanitario() {
        return IDsanitario;
    }

}
