package trabajo.vacheck.hospital;

import javax.persistence.Entity;

@Entity
public class Paciente {

    private String IdPaciente;
    private boolean HaFallecido;

    public String getIdPaciente() {
        return IdPaciente;
    }
    public void setIdPaciente(String idPaciente) {
        IdPaciente = idPaciente;
    }
    public boolean isHaFallecido() {
        return HaFallecido;
    }
    public void setHaFallecido(boolean haFallecido) {
        HaFallecido = haFallecido;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (HaFallecido ? 1231 : 1237);
        result = prime * result + ((IdPaciente == null) ? 0 : IdPaciente.hashCode());
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
        Paciente other = (Paciente) obj;
        if (HaFallecido != other.HaFallecido)
            return false;
        if (IdPaciente == null) {
            if (other.IdPaciente != null)
                return false;
        } else if (!IdPaciente.equals(other.IdPaciente))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "Paciente " + IdPaciente;
    }
}
