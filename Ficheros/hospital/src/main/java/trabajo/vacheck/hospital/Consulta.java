package trabajo.vacheck.hospital;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Consulta {

    @Id
    @GeneratedValue
    private Integer IdConsultaMedica;
    private String CitaMedica;
    private String Enfermedad;
    private String Diagnostico;
    private String VacunaId;



    public Consulta() {



    }


    public void AltaConsulta() {




    }


    public int getIdConsultaMedica() {
        return IdConsultaMedica;
    }


    public void setIdConsultaMedica(int idConsultaMedica) {
        IdConsultaMedica = idConsultaMedica;
    }


    public String getCitaMedica() {
        return CitaMedica;
    }


    public void setCitaMedica(String citaMedica) {
        CitaMedica = citaMedica;
    }


    public String getEnfermedad() {
        return Enfermedad;
    }


    public void setEnfermedad(String enfermedad) {
        Enfermedad = enfermedad;
    }


    public String getDiagnostico() {
        return Diagnostico;
    }


    public void setDiagnostico(String diagnostico) {
        Diagnostico = diagnostico;
    }


    public String getVacunaId() {
        return VacunaId;
    }


    public void setVacunaId(String vacunaId) {
        VacunaId = vacunaId;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((CitaMedica == null) ? 0 : CitaMedica.hashCode());
        result = prime * result + ((Diagnostico == null) ? 0 : Diagnostico.hashCode());
        result = prime * result + ((Enfermedad == null) ? 0 : Enfermedad.hashCode());
        result = prime * result + ((IdConsultaMedica == null) ? 0 : IdConsultaMedica.hashCode());
        result = prime * result + ((VacunaId == null) ? 0 : VacunaId.hashCode());
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
        Consulta other = (Consulta) obj;
        if (CitaMedica == null) {
            if (other.CitaMedica != null)
                return false;
        } else if (!CitaMedica.equals(other.CitaMedica))
            return false;
        if (Diagnostico == null) {
            if (other.Diagnostico != null)
                return false;
        } else if (!Diagnostico.equals(other.Diagnostico))
            return false;
        if (Enfermedad == null) {
            if (other.Enfermedad != null)
                return false;
        } else if (!Enfermedad.equals(other.Enfermedad))
            return false;
        if (IdConsultaMedica == null) {
            if (other.IdConsultaMedica != null)
                return false;
        } else if (!IdConsultaMedica.equals(other.IdConsultaMedica))
            return false;
        if (VacunaId == null) {
            if (other.VacunaId != null)
                return false;
        } else if (!VacunaId.equals(other.VacunaId))
            return false;
        return true;
    }

}
