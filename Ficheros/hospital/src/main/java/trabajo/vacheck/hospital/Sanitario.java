package trabajo.vacheck.hospital;

public class Sanitario extends sistemasInteligentes.Usuario {
    final private String IDsanitario;

    public Sanitario(String IDsan){
        IDsanitario = IDsan;
    }

    public String getIDsanitario() {
        return IDsanitario;
    }
}
