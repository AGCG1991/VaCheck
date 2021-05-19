package trabajo.vacheck.hospital;

public class Hospital {

    private String Direccion;
    private String Nombre;
    private int NumeroVacunados;


    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String direccion) {
        Direccion = direccion;
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
        result = prime * result + ((Direccion == null) ? 0 : Direccion.hashCode());
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
        if (Direccion == null) {
            if (other.Direccion != null)
                return false;
        } else if (!Direccion.equals(other.Direccion))
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

