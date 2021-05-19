package trabajo.vacheck.hospital;

public class Hospital {

    private String Dirección;
    private String Nombre;
    private int NumeroVacunados;


    public String getDirección() {
        return Dirección;
    }
    public void setDirección(String dirección) {
        Dirección = dirección;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public int getNumeroVacunados() {
        return NumeroVacunados;
    }
    public void setNumeroVacunados(int numeroVacunados) {
        NumeroVacunados = numeroVacunados;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Dirección == null) ? 0 : Dirección.hashCode());
        result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
        result = prime * result + NumeroVacunados;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Hospital other = (Hospital) obj;
        if (Dirección == null) {
            if (other.Dirección != null)
                return false;
        } else if (!Dirección.equals(other.Dirección))
            return false;
        if (Nombre == null) {
            if (other.Nombre != null)
                return false;
        } else if (!Nombre.equals(other.Nombre))
            return false;
        if (NumeroVacunados != other.NumeroVacunados)
            return false;
        return true;
    }

    public void AnyadirPaciente() {

    }

    public void AnyadirMedico() {

    }

    public void EliminarPaciente() {

    }

    public void EliminarPAciente() {

    }

}

